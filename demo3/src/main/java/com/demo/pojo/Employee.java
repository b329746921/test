package com.demo.pojo;

public class Employee {
    private Long id;

    private Long employeeNo;

    private String employeeName;

    private Long jobId;

    public Employee(Long id, Long employeeNo, String employeeName, Long jobId) {
        this.id = id;
        this.employeeNo = employeeNo;
        this.employeeName = employeeName;
        this.jobId = jobId;
    }

    public Employee() {
        super();
    }

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
        this.employeeName = employeeName == null ? null : employeeName.trim();
    }

    public Long getJobId() {
        return jobId;
    }

    public void setJobId(Long jobId) {
        this.jobId = jobId;
    }
}