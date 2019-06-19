package com.jh.applets.common.enums;

public enum RegionTypeEnum {

    Government(1,"行政区"),
    ScenicSpot(2,"景区");


    RegionTypeEnum(int code, String describe) {
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
