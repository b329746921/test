package com.demo.pojo;

public class Project {
    private Long id;

    private String projectNo;

    private String projectName;

    public Project(Long id, String projectNo, String projectName) {
        this.id = id;
        this.projectNo = projectNo;
        this.projectName = projectName;
    }

    public Project() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProjectNo() {
        return projectNo;
    }

    public void setProjectNo(String projectNo) {
        this.projectNo = projectNo == null ? null : projectNo.trim();
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName == null ? null : projectName.trim();
    }
}