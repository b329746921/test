package cn.bdqn.demo.pojo;

public class TGroupBase {
    private Long baseId;

    private Long grId;

    private Integer baseType;

    private Integer baseArea;

    private String baseAddress;

    private String basePostcode;

    private String baseTel;

    private String baseFax;

    private String baseEmail;

    public TGroupBase(Long baseId, Long grId, Integer baseType, Integer baseArea, String baseAddress, String basePostcode, String baseTel, String baseFax, String baseEmail) {
        this.baseId = baseId;
        this.grId = grId;
        this.baseType = baseType;
        this.baseArea = baseArea;
        this.baseAddress = baseAddress;
        this.basePostcode = basePostcode;
        this.baseTel = baseTel;
        this.baseFax = baseFax;
        this.baseEmail = baseEmail;
    }

    public TGroupBase() {
        super();
    }

    public Long getBaseId() {
        return baseId;
    }

    public void setBaseId(Long baseId) {
        this.baseId = baseId;
    }

    public Long getGrId() {
        return grId;
    }

    public void setGrId(Long grId) {
        this.grId = grId;
    }

    public Integer getBaseType() {
        return baseType;
    }

    public void setBaseType(Integer baseType) {
        this.baseType = baseType;
    }

    public Integer getBaseArea() {
        return baseArea;
    }

    public void setBaseArea(Integer baseArea) {
        this.baseArea = baseArea;
    }

    public String getBaseAddress() {
        return baseAddress;
    }

    public void setBaseAddress(String baseAddress) {
        this.baseAddress = baseAddress == null ? null : baseAddress.trim();
    }

    public String getBasePostcode() {
        return basePostcode;
    }

    public void setBasePostcode(String basePostcode) {
        this.basePostcode = basePostcode == null ? null : basePostcode.trim();
    }

    public String getBaseTel() {
        return baseTel;
    }

    public void setBaseTel(String baseTel) {
        this.baseTel = baseTel == null ? null : baseTel.trim();
    }

    public String getBaseFax() {
        return baseFax;
    }

    public void setBaseFax(String baseFax) {
        this.baseFax = baseFax == null ? null : baseFax.trim();
    }

    public String getBaseEmail() {
        return baseEmail;
    }

    public void setBaseEmail(String baseEmail) {
        this.baseEmail = baseEmail == null ? null : baseEmail.trim();
    }
}