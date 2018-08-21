package cn.bdqn.demo.pojo;

public class TData {
    private Integer dataId;

    private String dataName;

    private String dataType;

    public TData(Integer dataId, String dataName, String dataType) {
        this.dataId = dataId;
        this.dataName = dataName;
        this.dataType = dataType;
    }

    public TData() {
        super();
    }

    public Integer getDataId() {
        return dataId;
    }

    public void setDataId(Integer dataId) {
        this.dataId = dataId;
    }

    public String getDataName() {
        return dataName;
    }

    public void setDataName(String dataName) {
        this.dataName = dataName == null ? null : dataName.trim();
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType == null ? null : dataType.trim();
    }
}