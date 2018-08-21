package cn.bdqn.demo.pojo;

import java.util.Date;

public class TPersonRelation {
    private Long reId;

    private Long peId;

    private Long grId;

    private String rePactno;

    private Date rePactdate;

    private String reDept;

    private Integer reJob;

    private Date reDeletedate;

    public TPersonRelation(Long reId, Long peId, Long grId, String rePactno, Date rePactdate, String reDept, Integer reJob, Date reDeletedate) {
        this.reId = reId;
        this.peId = peId;
        this.grId = grId;
        this.rePactno = rePactno;
        this.rePactdate = rePactdate;
        this.reDept = reDept;
        this.reJob = reJob;
        this.reDeletedate = reDeletedate;
    }

    public TPersonRelation() {
        super();
    }

    public Long getReId() {
        return reId;
    }

    public void setReId(Long reId) {
        this.reId = reId;
    }

    public Long getPeId() {
        return peId;
    }

    public void setPeId(Long peId) {
        this.peId = peId;
    }

    public Long getGrId() {
        return grId;
    }

    public void setGrId(Long grId) {
        this.grId = grId;
    }

    public String getRePactno() {
        return rePactno;
    }

    public void setRePactno(String rePactno) {
        this.rePactno = rePactno == null ? null : rePactno.trim();
    }

    public Date getRePactdate() {
        return rePactdate;
    }

    public void setRePactdate(Date rePactdate) {
        this.rePactdate = rePactdate;
    }

    public String getReDept() {
        return reDept;
    }

    public void setReDept(String reDept) {
        this.reDept = reDept == null ? null : reDept.trim();
    }

    public Integer getReJob() {
        return reJob;
    }

    public void setReJob(Integer reJob) {
        this.reJob = reJob;
    }

    public Date getReDeletedate() {
        return reDeletedate;
    }

    public void setReDeletedate(Date reDeletedate) {
        this.reDeletedate = reDeletedate;
    }
}