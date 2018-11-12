package com.demo.demo2.common;

/**
 * @author banzijian
 * @date 2018/11/12
 **/
public enum DistrictEnum {
    CHAOYANG(1, "朝阳"),
    HAIDIAN(2, "海淀"),
    FENGTAI(3, "丰台"),
    XICHENG(4, "西城"),
    CHANGPING(5, "昌平"),
    ;

    private int districtCode;
    private String districtName;

    private DistrictEnum(int districtCode, String districtName) {
        this.districtCode = districtCode;
        this.districtName = districtName;
    }

    public int getDistrictCode() {
        return districtCode;
    }

    public void setDistrictCode(int districtCode) {
        this.districtCode = districtCode;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }
}
