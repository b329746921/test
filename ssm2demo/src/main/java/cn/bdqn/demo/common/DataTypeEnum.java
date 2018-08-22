package cn.bdqn.demo.common;

/**
 *
 **/
public enum DataTypeEnum {
    BASE_TYPE("BASE_TYPE", "企业类型"),
    BASE_AREA("BASE_AREA", "地区"),
    PE_RECORD("PE_RECORD", "学历"),
    PE_TECHNICAL("PE_TECHNICAL", "职称"),
    RE_JOB("RE_JOB", "工作"),
    PE_PROFESSIONAL("PE_PROFESSIONAL", "专业")
    ;

    private String code;
    private String msg;

    DataTypeEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
    
    public static DataTypeEnum getDataTypeEnum(String code){
        for (DataTypeEnum value : DataTypeEnum.values()) {
            if (value.getCode().equals(code)) {
                return value;
            }
        }
        return null;
    }
}
