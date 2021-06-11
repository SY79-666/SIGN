package com.project.signin.Entity;

import com.common.Annoation.FieldName;
import com.common.result.AbstractSignUser;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * @author suyu
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class SignPunch extends AbstractSignUser {

    @FieldName(value = "用户工号ID(UUID)")
    private String id;

    @FieldName(value = "用户姓名")
    private String name;

    @FieldName(value = "正常开始打卡时间")
    private Date startNormalTime;

    @FieldName(value = "正常结束打卡时间")
    private Date endNormalTime;

    @FieldName(value = "加班开始打卡时间")
    private Date startOvertime;

    @FieldName(value = "加班结束打卡时间")
    private Date endOvertime;

    @FieldName(value = "正常工时")
    private Integer normalHours;

    @FieldName(value = "加班工时")
    private Integer overHours;

    public SignPunch() {
    }

    @Override
    public void signUserCheck() {

    }
}