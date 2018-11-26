package com.demo.pojo;

public class Job {
    private Long id;

    private String jobName;

    private Double salary;

    public Job(Long id, String jobName, Double salary) {
        this.id = id;
        this.jobName = jobName;
        this.salary = salary;
    }

    public Job() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName == null ? null : jobName.trim();
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}