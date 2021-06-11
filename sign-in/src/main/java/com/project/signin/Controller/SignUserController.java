package com.project.signin.Controller;

import com.common.PagingUtil.Paging;
import com.common.PagingUtil.PagingUtil;
import com.common.ReturnDataUtil.PayMessageEnum;
import com.common.ReturnDataUtil.PayResultUtil;
import com.common.ReturnDataUtil.ReturnData;
import com.common.ReturnDataUtil.ReturnPageData;
import com.project.signin.Entity.SignUser;
import com.project.signin.Service.SignUserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

/**
 * @author suyu
 */
@Controller
@RequestMapping("com/staff/information")
@Transactional(rollbackFor = Exception.class)
public class SignUserController {

    private final SignUserService signUserService;

    @Lazy
    public SignUserController(SignUserService signUserService) {
        this.signUserService = signUserService;
    }

    @ApiOperation(value = "单点登录", notes = "单点登录")
    @PostMapping(value = "/login")
    @ResponseBody
    public ReturnData singleSign(String userId, String password) {
        return signUserService.singleSignService(userId, password);
    }

    @ApiOperation(value = "查询用户信息", notes = "查询用户信息")
    @PostMapping(value = "/selectUser")
    @ResponseBody
    public ReturnPageData selectUserInformation(@RequestBody(required = false) Map<String, Object> map, HttpServletRequest request) {
        Paging paging = new Paging();
        PagingUtil.createPagingByMap(map);
        List<SignUser> list = signUserService.selectUserInformationService(map, request);

        if (paging == null) {
            paging.setNowPage(1);
            paging.setNowPageNo(50);
            paging.setLoadDataCount(true);
        }
        return PayResultUtil.returnPageSuccess(list, paging, PayMessageEnum.SUCCESS);
    }

    @ApiOperation(value = "注册用户信息", notes = "注册用户信息")
    @PostMapping(value = "/insertUser")
    @ResponseBody
    public ReturnData insertUserController(@RequestBody List<SignUser> record, HttpServletRequest request) {
        return signUserService.insertUserService(record, request);
    }

    @ApiOperation(value = "删除员工", notes = "删除员工")
    @PostMapping("/deleteUser")
    @ResponseBody
    public ReturnData<Boolean> deleteUserController(String id, @RequestBody Map<String, Object> map, HttpServletRequest request) {
        return signUserService.deleteUserService(id, map, request);
    }

}
