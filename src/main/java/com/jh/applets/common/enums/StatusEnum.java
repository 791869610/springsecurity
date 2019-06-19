package com.jh.applets.common.enums;

public enum StatusEnum {

    TRUE(1,"有效"),
    FALSE(2,"无效");


    StatusEnum(int code, String describe) {
        this.code = code;
        this.describe = describe;
    }

    private int code;
    private String describe;

    public int getCode() {
        return code;
    }

    public String getDescribe() {
        return describe;
    }

}
