package com.demo.pojo;

/**
 * @author banzijian
 * @date 2018/11/26
 **/
public class Show {
    private String projectNo;
    private String projectName;
    private Long employeeNo;
    private String employeeName;
    private String jobName;
    private Double salary;
    private Long workHour;

    public Show(String projectNo, String projectName, Long employeeNo, String employeeName, String jobName, Double salary, Long workHour) {
        this.projectNo = projectNo;
        this.projectName = projectName;
        this.employeeNo = employeeNo;
        this.employeeName = employeeName;
        this.jobName = jobName;
        this.salary = salary;
        this.workHour = workHour;
    }

    public String getProjectNo() {
        return projectNo;
    }

    public void setProjectNo(String projectNo) {
        this.projectNo = projectNo;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
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

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Long getWorkHour() {
        return workHour;
    }

    public void setWorkHour(Long workHour) {
        this.workHour = workHour;
    }
}
