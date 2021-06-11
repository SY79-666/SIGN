package com.common.ReturnDataUtil;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * @author suyu
 */
@ApiModel(
        description = "分页返回对象"
)
public class ReturnPageData<T> implements Serializable {
    private static final long serialVersionUID = -8888941712093859361L;
    @ApiModelProperty("状态码")
    private String status_code;
    @ApiModelProperty("消息提示")
    private String reason;
    @ApiModelProperty("数据")
    private T data;
    @ApiModelProperty("合计行数据")
    private T sumData;
    @ApiModelProperty("数据总数")
    private int dataCount;
    @ApiModelProperty("当前页码")
    private int nowPage;
    @ApiModelProperty("当前页显示条数")
    private int nowPageNo;

    public T getSumData() {
        return this.sumData;
    }

    public void setSumData(T sumData) {
        this.sumData = sumData;
    }

    public ReturnPageData(T data, String reason, int dataCount) {
        this.status_code = "0000";
        this.data = data;
        this.dataCount = dataCount;
    }

    public ReturnPageData() {
    }

    public ReturnPageData(String status_code, String reason, T data, int dataCount) {
        this.status_code = status_code;
        this.reason = reason;
        this.data = data;
        this.dataCount = dataCount;
    }

    public ReturnPageData(String reason, T data, int dataCount, int nowPage, int nowPageNo) {
        this.status_code = "0000";
        this.reason = reason;
        this.data = data;
        this.dataCount = dataCount;
        this.nowPage = nowPage;
        this.nowPageNo = nowPageNo;
    }

    public ReturnPageData(String status_code, String reason, T data, int dataCount, int nowPage, int nowPageNo) {
        this.status_code = status_code;
        this.reason = reason;
        this.data = data;
        this.dataCount = dataCount;
        this.nowPage = nowPage;
        this.nowPageNo = nowPageNo;
    }

    public void setStatus_code(String status_code) {
        this.status_code = status_code;
    }

    public String getStatus_code() {
        return this.status_code;
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

    public int getDataCount() {
        return this.dataCount;
    }

    public void setDataCount(int dataCount) {
        this.dataCount = dataCount;
    }

    public int getNowPage() {
        return this.nowPage;
    }

    public void setNowPage(int nowPage) {
        this.nowPage = nowPage;
    }

    public int getNowPageNo() {
        return this.nowPageNo;
    }

    public void setNowPageNo(int nowPageNo) {
        this.nowPageNo = nowPageNo;
    }
}
