package com.project.signin.Entity;

import com.common.Annoation.FieldName;
import com.common.result.AbstractSignUser;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author suyu
 */
@EqualsAndHashCode(callSuper = false)
@Data
public class SignUser extends AbstractSignUser {

    @FieldName(value = "用户ID")
    private String id;

    @FieldName(value = "用户账号")
    private String accountUser;

    @FieldName(value = "用户密码")
    private String accountPassword;

    @FieldName(value = "用户姓名")
    private String name;

    @FieldName(value = "用户电话")
    private String phone;

    @FieldName(value = "用户角色")
    private String role;

    @FieldName(value = "用户所属部门")
    private String department;

    public SignUser() {
    }

    @Override
    public void signUserCheck() {

    }
}