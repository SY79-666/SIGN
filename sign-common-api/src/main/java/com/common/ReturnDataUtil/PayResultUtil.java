package com.common.ReturnDataUtil;

import com.common.PagingUtil.Paging;

import java.util.List;

/**
 * @author suyu
 */
public class PayResultUtil {
    private static final int NowPage = 1;
    private static final int NowPageNo = 20;

    public PayResultUtil() {
    }

    public static <T> ReturnData<T> returnSuccess(T data, PayBaseMessageEnum payEnum) {
        ExceptionUtil exceptionUtil = ExceptionUtil.get();
        if (exceptionUtil != null) {
            payEnum = PayMessageEnum.getPayMessageEnumByCode(exceptionUtil.getErrorCode());
            data = (T) exceptionUtil.getErrorMsg();
            ExceptionUtil.remove();
        }

        ReturnData<T> result = new ReturnData();
        result.setStatus_code(payEnum.getCode());
        result.setReason(payEnum.getDesc());
        result.setData(data);
        return result;
    }

    public static <T> ReturnData<T> returnError(PayBaseMessageEnum payEnum) {
        ReturnData<T> result = new ReturnData();
        result.setStatus_code(payEnum.getCode());
        result.setReason(payEnum.getDesc());
        return result;
    }

    public static <T> ReturnData<T> returnError(String code, String desc) {
        ReturnData<T> result = new ReturnData();
        result.setStatus_code(code);
        result.setReason(desc);
        return result;
    }

    public static <T> ReturnPageData<T> returnPageSuccess(T data, Paging page, PayBaseMessageEnum payEnum) {
        int dataCount = 0;
        if (data instanceof List) {
            dataCount = ((List) data).size();
        } else if (data instanceof ReturnPage) {
            dataCount = ((ReturnPage) data).getDataCount();
        }

        ReturnPageData<T> result = null;
        if (page == null) {
            result = new ReturnPageData(payEnum.getCode(), payEnum.getDesc(), data, dataCount, 1, 20);
        } else {
            result = new ReturnPageData(payEnum.getCode(), payEnum.getDesc(), data, page.getDataCount(), page.getNowPage(), page.getNowPageNo());
        }

        result.setStatus_code(payEnum.getCode());
        result.setReason(payEnum.getDesc());
        return result;
    }

    public static <T> ReturnPageData<T> returnPageError(PayBaseMessageEnum payEnum) {
        ReturnPageData<T> result = new ReturnPageData(payEnum.getCode(), payEnum.getDesc(), (Object) null, 0);
        result.setStatus_code(payEnum.getCode());
        result.setReason(payEnum.getDesc());
        return result;
    }

    public static <T> ReturnPageData<T> returnPageError(String code, String desc) {
        ReturnPageData<T> result = new ReturnPageData(code, desc, (Object) null, 0);
        result.setStatus_code(code);
        result.setReason(desc);
        return result;
    }

    public static <T> ReturnData<T> returnSuccess(String code, String desc) {
        ReturnData<T> result = new ReturnData();
        result.setStatus_code(code);
        result.setReason(desc);
        return result;
    }
}
