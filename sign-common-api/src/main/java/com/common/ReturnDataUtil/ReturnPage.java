package com.common.ReturnDataUtil;

import com.common.PagingUtil.Paging;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.List;

/**
 * @author suyu
 */
public class ReturnPage<T> implements Serializable {
    private static final long serialVersionUID = 3470490699009512039L;
    private List<T> pageData;
    private int pageCount;
    private int pageSize;
    private int dataCount;
    @ApiModelProperty("总数")
    private Integer total;
    @ApiModelProperty("查询数据")
    private List<T> rows;

    public ReturnPage() {
    }

    public ReturnPage(List<T> pageData, Paging page) {
        this.setPageData(pageData);
        this.setPageObj(page);
    }

    public List<T> getPageData() {
        return this.pageData;
    }

    public void setPageData(List<T> pageData) {
        this.pageData = pageData;
    }

    public int getPageCount() {
        return this.pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getDataCount() {
        return this.dataCount;
    }

    public void setDataCount(int dataCount) {
        this.dataCount = dataCount;
    }

    public void setPageObj(Paging page) {
        if (page != null) {
            this.setDataCount(page.getDataCount());
            int tmpPage = page.getDataCount() / page.getNowPageNo();
            int subPage = page.getDataCount() % page.getNowPageNo();
            this.setPageCount(subPage == 0 ? tmpPage : tmpPage + 1);
            this.setPageSize(page.getNowPageNo());
        }

    }

    public ReturnPage(int total, List rows) {
        this.total = total;
        this.rows = rows;
    }

    public Integer getTotal() {
        return this.total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List getRows() {
        return this.rows;
    }

    public void setRows(List rows) {
        this.rows = rows;
    }
}
