package com.common.ReturnDataUtil;

/**
 * @author suyu
 */
public class ExceptionUtil {
    private String errorCode;
    private String errorMsg;
    private String remark;
    private boolean isContinue;
    private static final ThreadLocal<ExceptionUtil> threadLocal = new ThreadLocal();

    public ExceptionUtil() {
    }

    public static ExceptionUtil init() {
        ExceptionUtil exception = new ExceptionUtil();
        threadLocal.set(exception);
        return exception;
    }

    public static ExceptionUtil get() {
        return (ExceptionUtil)threadLocal.get();
    }

    public static void set(ExceptionUtil exception) {
        threadLocal.set(exception);
    }

    public static void remove() {
        threadLocal.remove();
    }

    public String getErrorCode() {
        return this.errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return this.errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public boolean isContinue() {
        return this.isContinue;
    }

    public void setContinue(boolean isContinue) {
        this.isContinue = isContinue;
    }
}
