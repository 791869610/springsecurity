package com.jh.applets.common.enums;

public enum SourceTypeEnum {

    IMPORT(1,"后台导入"),
    ADD(2,"后台添加"),
    AUTO(3,"自动拉取");


    SourceTypeEnum(int code, String describe) {
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
