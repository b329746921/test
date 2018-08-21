package cn.bdqn.demo.pojo;

public class TGroup {
    private Long grId;

    private String grCode;

    private String grName;

    private String grLicense;

    private String grPassword;

    public TGroup(Long grId, String grCode, String grName, String grLicense, String grPassword) {
        this.grId = grId;
        this.grCode = grCode;
        this.grName = grName;
        this.grLicense = grLicense;
        this.grPassword = grPassword;
    }

    public TGroup() {
        super();
    }

    public Long getGrId() {
        return grId;
    }

    public void setGrId(Long grId) {
        this.grId = grId;
    }

    public String getGrCode() {
        return grCode;
    }

    public void setGrCode(String grCode) {
        this.grCode = grCode == null ? null : grCode.trim();
    }

    public String getGrName() {
        return grName;
    }

    public void setGrName(String grName) {
        this.grName = grName == null ? null : grName.trim();
    }

    public String getGrLicense() {
        return grLicense;
    }

    public void setGrLicense(String grLicense) {
        this.grLicense = grLicense == null ? null : grLicense.trim();
    }

    public String getGrPassword() {
        return grPassword;
    }

    public void setGrPassword(String grPassword) {
        this.grPassword = grPassword == null ? null : grPassword.trim();
    }
}