package cn.bdqn.demo.pojo;

import java.util.Date;

public class TPersonVo {
    private Long peId;

    private String peName;

    private String peSex;

    private String peBirthday;

    private String peSchool;

    private Integer peProfessional;

    private Integer peRecord;

    private String peFinishSchool;

    private String peCardid;

    private Integer peTechnical;

    private String peAssessDate;

    private String peAddress;

    private String peTel;

    private String peSpeciality;

    public TPersonVo() {
    }

    public TPersonVo(Long peId, String peName, String peSex, String peBirthday, String peSchool, Integer peProfessional, Integer peRecord, String peFinishSchool, String peCardid, Integer peTechnical, String peAssessDate, String peAddress, String peTel, String peSpeciality) {
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
        this.peName = peName;
    }

    public String getPeSex() {
        return peSex;
    }

    public void setPeSex(String peSex) {
        this.peSex = peSex;
    }

    public String getPeBirthday() {
        return peBirthday;
    }

    public void setPeBirthday(String peBirthday) {
        this.peBirthday = peBirthday;
    }

    public String getPeSchool() {
        return peSchool;
    }

    public void setPeSchool(String peSchool) {
        this.peSchool = peSchool;
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

    public String getPeFinishSchool() {
        return peFinishSchool;
    }

    public void setPeFinishSchool(String peFinishSchool) {
        this.peFinishSchool = peFinishSchool;
    }

    public String getPeCardid() {
        return peCardid;
    }

    public void setPeCardid(String peCardid) {
        this.peCardid = peCardid;
    }

    public Integer getPeTechnical() {
        return peTechnical;
    }

    public void setPeTechnical(Integer peTechnical) {
        this.peTechnical = peTechnical;
    }

    public String getPeAssessDate() {
        return peAssessDate;
    }

    public void setPeAssessDate(String peAssessDate) {
        this.peAssessDate = peAssessDate;
    }

    public String getPeAddress() {
        return peAddress;
    }

    public void setPeAddress(String peAddress) {
        this.peAddress = peAddress;
    }

    public String getPeTel() {
        return peTel;
    }

    public void setPeTel(String peTel) {
        this.peTel = peTel;
    }

    public String getPeSpeciality() {
        return peSpeciality;
    }

    public void setPeSpeciality(String peSpeciality) {
        this.peSpeciality = peSpeciality;
    }
}