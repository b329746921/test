package cn.bdqn.demo.pojo;

import java.util.Date;

public class TPerson {
    private Long peId;

    private String peName;

    private String peSex;

    private Date peBirthday;

    private String peSchool;

    private Integer peProfessional;

    private Integer peRecord;

    private Date peFinishSchool;

    private String peCardid;

    private Integer peTechnical;

    private Date peAssessDate;

    private String peAddress;

    private String peTel;

    private String peSpeciality;

    public TPerson(Long peId, String peName, String peSex, Date peBirthday, String peSchool, Integer peProfessional, Integer peRecord, Date peFinishSchool, String peCardid, Integer peTechnical, Date peAssessDate, String peAddress, String peTel, String peSpeciality) {
        this.peId = peId;
        this.peName = peName;
        this.peSex = peSex;
        this.peBirthday = peBirthday;
        this.peSchool = peSchool;
        this.peProfessional = peProfessional;
        this.peRecord = peRecord;
        this.peFinishSchool = peFinishSchool;
        this.peCardid = peCardid;
        this.peTechnical = peTechnical;
        this.peAssessDate = peAssessDate;
        this.peAddress = peAddress;
        this.peTel = peTel;
        this.peSpeciality = peSpeciality;
    }

    public TPerson() {
        super();
    }

    public Long getPeId() {
        return peId;
    }

    public void setPeId(Long peId) {
        this.peId = peId;
    }

    public String getPeName() {
        return peName;
    }

    public void setPeName(String peName) {
        this.peName = peName == null ? null : peName.trim();
    }

    public String getPeSex() {
        return peSex;
    }

    public void setPeSex(String peSex) {
        this.peSex = peSex == null ? null : peSex.trim();
    }

    public Date getPeBirthday() {
        return peBirthday;
    }

    public void setPeBirthday(Date peBirthday) {
        this.peBirthday = peBirthday;
    }

    public String getPeSchool() {
        return peSchool;
    }

    public void setPeSchool(String peSchool) {
        this.peSchool = peSchool == null ? null : peSchool.trim();
    }

    public Integer getPeProfessional() {
        return peProfessional;
    }

    public void setPeProfessional(Integer peProfessional) {
        this.peProfessional = peProfessional;
    }

    public Integer getPeRecord() {
        return peRecord;
    }

    public void setPeRecord(Integer peRecord) {
        this.peRecord = peRecord;
    }

    public Date getPeFinishSchool() {
        return peFinishSchool;
    }

    public void setPeFinishSchool(Date peFinishSchool) {
        this.peFinishSchool = peFinishSchool;
    }

    public String getPeCardid() {
        return peCardid;
    }

    public void setPeCardid(String peCardid) {
        this.peCardid = peCardid == null ? null : peCardid.trim();
    }

    public Integer getPeTechnical() {
        return peTechnical;
    }

    public void setPeTechnical(Integer peTechnical) {
        this.peTechnical = peTechnical;
    }

    public Date getPeAssessDate() {
        return peAssessDate;
    }

    public void setPeAssessDate(Date peAssessDate) {
        this.peAssessDate = peAssessDate;
    }

    public String getPeAddress() {
        return peAddress;
    }

    public void setPeAddress(String peAddress) {
        this.peAddress = peAddress == null ? null : peAddress.trim();
    }

    public String getPeTel() {
        return peTel;
    }

    public void setPeTel(String peTel) {
        this.peTel = peTel == null ? null : peTel.trim();
    }

    public String getPeSpeciality() {
        return peSpeciality;
    }

    public void setPeSpeciality(String peSpeciality) {
        this.peSpeciality = peSpeciality == null ? null : peSpeciality.trim();
    }
}