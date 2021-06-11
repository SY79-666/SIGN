package com.common.ReturnDataUtil;

/**
 * @author suyu
 */

public enum PayMessageEnum implements PayBaseMessageEnum {
    SUCCESS("200", "成功"),
    ERROR("500", "失败"),
    MON("501", "违反监控规则"),
    MON1("501-1", "违反监控规则"),
    MON2("501-2", "违反监控规则"),
    MON3("501-3", "违反监控规则"),
    MON4("501-4", "违反监控规则");

    private String code;

    private String desc;

    public static PayMessageEnum getPayMessageEnumByCode(String code) {
        PayMessageEnum[] payMessageEnums = values();
        PayMessageEnum[] var2 = payMessageEnums;
        int var3 = payMessageEnums.length;

        for (int var4 = 0; var4 < var3; ++var4) {
            PayMessageEnum payMessageEnum = var2[var4];
            if (payMessageEnum.getCode().equals(code)) {
                return payMessageEnum;
            }
        }

        return null;
    }

    private PayMessageEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    @Override
    public String getCode() {
        return this.code;
    }

    @Override
    public String getDesc() {
        return this.desc;
    }

    @Override
    public String toString() {
        return "ErrorCodeEnum{code='" + this.code + '\'' + ", desc='" + this.desc + '\'' + '}';
    }
}
