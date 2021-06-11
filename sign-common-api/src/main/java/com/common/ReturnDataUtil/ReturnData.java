package com.common.ReturnDataUtil;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * @author suyu
 */
public class ReturnData<T> implements Serializable {
    private static final long serialVersionUID = 1L;
    @ApiModelProperty("状态码")
    private String status_code;
    @ApiModelProperty("消息提示")
    private String reason;
    @ApiModelProperty("数据")
    private T data;

    public ReturnData() {
        this.status_code = "0000";
    }

    public ReturnData(String code, String reason) {
        this.status_code = code;
        this.reason = reason;
    }

    public ReturnData(T data) {
        this.status_code = "0000";
        this.data = data;
    }

    public ReturnData(String code, String reason, T data) {
        this.status_code = code;
        this.reason = reason;
        this.data = data;
    }

    public String getStatus_code() {
        return this.status_code;
    }

    public void setStatus_code(String status_code) {
        this.status_code = status_code;
    }

    public String getReason() {
        return this.reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
