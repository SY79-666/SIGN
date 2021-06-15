package com.project.signin.Service.Impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.common.ReturnDataUtil.*;
import com.project.signin.Dao.SignUserMapper;
import com.project.signin.Entity.SignUser;
import com.project.signin.Service.SignUserService;
import com.project.signin.Utils.JwtUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.security.MessageDigest;
import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;


/**
 * @author suyu
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class SignUserServiceImpl implements SignUserService {

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    private final String ID = "id";

    private final String ROLE = "role";

    private final String ADMIN = "管理员";

    private final String SUPER_ADMIN = "超级管理员";

    private final SignUserMapper signUserMapper;

    @Lazy
    public SignUserServiceImpl(SignUserMapper signUserMapper) {
        this.signUserMapper = signUserMapper;
    }

    @Override
    public ReturnData<String> singleSignService(String userId, String password) {
        Map<String, String> param = new HashMap<>(16);
        if (StringUtils.hasText(userId)) {
            if (StringUtils.hasText(password)) {
                signUserMapper.singleLogin(userId, password);
                try {
                    String token = JwtUtils.createToken(param);
                    param.put("token", token);
                    JwtUtils.verifyToken(token);
                } catch (Exception e) {
                    PayResultUtil.returnError(PayMessageEnum.ERROR);
                    e.printStackTrace();
                }
            }
        }
        return PayResultUtil.returnSuccess(param.get("token"), PayMessageEnum.SUCCESS);
    }

    @Override
    public List<SignUser> selectUserInformationService(Map<String, List<Object>> map, HttpServletRequest request) {
        HttpSession session = request.getSession();
        Assert.notNull(session, "Session must be not null");
        map.remove("pageNumber");
        map.remove("pageSize");
        List<SignUser> list = null;
//        String obj = JSON.toJSONString(map.get(ID));
        Map<String, Object> spareMap = new HashMap<>(map.size());
//        Object obj = map.get(ID);
        if (null != map.get(ID)) {
//            spareMap.put(ID,obj.toString().replace("[","").replace("]",""));
            list = signUserMapper.selectInformation(map);
        }
//        Assert.notNull(session.getAttribute("token"),"未获取到Token相关信息，无法鉴权");
//        this.renewalToken(session.getAttribute("token").toString());
        return list;
    }

    @Override
    public ReturnData<String> insertUserService(List<SignUser> record, HttpServletRequest request) {
        Assert.notNull(record, "请确认员工信息填写完整");
        HttpSession session = request.getSession();
        Assert.notNull(session, "Session must be not null");
        record.forEach(item -> {
            if (this.verifyRepeatability(item, request).get()) {
                item.setId(String.valueOf(UUID.randomUUID()));
                signUserMapper.insert(Collections.singletonList(item));
            }
        });
        return PayResultUtil.returnSuccess("200", "用户注册成功");
    }

    @Override
    public ReturnData deleteUserService(String id, Map<String, Object> map, HttpServletRequest request) {
        Assert.notNull(map, "未获取到角色信息");
        Assert.notNull(id, "请选择需要操作的数据");
        if (null != map.get(ROLE)) {
            if (ADMIN.equals(map.get(ROLE)) || SUPER_ADMIN.equals(map.get(ROLE))) {
                Map<String, List<Object>> ids = new HashMap<>();
                if (0 != this.selectUserInformationService(ids, request).size()) {
                    signUserMapper.deleteByPrimaryKey(ids);
                } else {
                    LOGGER.error("未查询到[%s]相关信息", id);
                }
            } else {
                LOGGER.error("用户权限不足");
                try {
                    throw new Exception("用户权限不足");
                } catch (Exception e) {
                    e.printStackTrace();
                    PayResultUtil.returnError(PayMessageEnum.ERROR);
                }
            }
        } else {
            LOGGER.error("未获取到完整的用户信息");
            try {
                throw new Exception("未获取到完整的用户信息");
            } catch (Exception e) {
                e.printStackTrace();
                PayResultUtil.returnError(PayMessageEnum.ERROR);
            }
        }
        return PayResultUtil.returnSuccess(PayMessageEnum.SUCCESS.getCode(), "操作成功");
    }

    private String renewalToken(String oldToken) {
        String updateToken = null;
        if (StringUtils.hasText(oldToken)) {
            Map<String, String> map = new HashMap<>(16);
            try {
                JwtUtils.verifyToken(oldToken);
                updateToken = map.put("token", JwtUtils.createToken(map));
            } catch (Exception e) {
                PayResultUtil.returnError(PayMessageEnum.ERROR);
                e.printStackTrace();
            }
        }
        return updateToken;
    }

    /**
     * 判断新增用户中是否有相同的账号信息
     *
     * @param signUser 用户信息
     * @param request  HTTP请求
     * @return AtomicBoolean
     */
    private AtomicBoolean verifyRepeatability(SignUser signUser, HttpServletRequest request) {
        Map<String, List<Object>> map = new HashMap<>(16);
        AtomicBoolean flag = new AtomicBoolean(false);
        List<Integer> flagList = new ArrayList<>();
        this.selectUserInformationService(map, request).forEach(item -> {
            if (item.getAccountUser().equals(signUser.getAccountUser())) {
                flagList.add(1);
            } else {
                flagList.add(2);
            }
        });

        if (flagList.contains(1)) {
            try {
                LOGGER.error("账号:{" + signUser.getAccountUser() + "}已存在");
                throw new Exception("账号[%s]已存在" + signUser.getAccountUser());
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            flag.set(true);
        }

        return flag;
    }
}