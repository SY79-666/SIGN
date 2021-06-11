package com.common.PagingUtil;

import java.io.Serializable;

/**
 * @author suyu
 */
public class SimplePage implements Serializable {
    private static final long serialVersionUID = 6564289263227702212L;
    private int startIndex = -1;
    private int dataCount;
    private boolean isLoadDataCount;
    private boolean isLoadData = true;
    private int nowPage;
    private int nowPageNo;

    public SimplePage() {
    }

    public boolean isLoadData() {
        return this.isLoadData;
    }

    public void setLoadData(boolean isLoadData) {
        this.isLoadData = isLoadData;
    }

    public boolean isLoadDataCount() {
        return this.isLoadDataCount;
    }

    public void setLoadDataCount(boolean isLoadDataCount) {
        this.isLoadDataCount = isLoadDataCount;
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

    public int getDataCount() {
        return this.dataCount;
    }

    public void setDataCount(int dataCount) {
        this.dataCount = dataCount;
    }

    public int getStartIndex() {
        return this.startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }
}
