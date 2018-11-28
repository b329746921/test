package com.demo.pojo;

/**
 * @author banzijian
 * @date 2018/11/28
 **/
public class EmployeeVo {
    private Long id;

    private Long employeeNo;

    private String employeeName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getEmployeeNo() {
        return employeeNo;
    }

    public void setEmployeeNo(Long employeeNo) {
        this.employeeNo = employeeNo;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    private String jobId;
}
