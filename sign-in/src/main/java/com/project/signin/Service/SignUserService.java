package com.project.signin.Service;

import com.common.ReturnDataUtil.ReturnData;
import com.project.signin.Entity.SignUser;

import javax.servlet.http.HttpServletRequest;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;

/**
 * @author suyu
 */
public interface SignUserService {

    /**
     * 单点登录
     *
     * @param userId   用户ID
     * @param password 用户密码
     * @return ReturnData<String>
     */
    ReturnData<String> singleSignService(@NotNull(message = "账号不可为空") @NotEmpty(message = "账号不可为空") String userId,
                                         @NotNull(message = "密码不可为空") @NotEmpty(message = "密码不可为空") String password);

    /**
     * 查询用户信息(支持姓名,手机号,账号查询)
     *
     * @param map     线索信息
     * @param request HTTP请求
     * @return List<SignUser>
     */
    List<SignUser> selectUserInformationService(Map<String, Object> map, HttpServletRequest request);

    /**
     * 注册用户信息
     *
     * @param record  用户相关信息
     * @param request HTTP请求
     * @return ReturnData
     */
    ReturnData<String> insertUserService(@NotNull(message = "填写信息不能为空") @NotEmpty(message = "填写信息不能为空") List<SignUser> record,
                                         HttpServletRequest request);

    /**
     * 删除员工信息
     *
     * @param id      员工主键
     * @param map     用户权限信息
     * @param request HTTP请求
     * @return ReturnData
     */
    ReturnData<Boolean> deleteUserService(@NotNull(message = "请选择需要操作的数据") @NotEmpty(message = "请选择需要操作的数据") String id,
                                          Map<String, Object> map, HttpServletRequest request);

}
