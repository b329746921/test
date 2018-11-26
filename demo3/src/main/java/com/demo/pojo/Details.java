package com.demo.pojo;

public class Details {
    private Long id;

    private Long projectId;

    private Long personId;

    private Long workHour;

    public Details(Long id, Long projectId, Long personId, Long workHour) {
        this.id = id;
        this.projectId = projectId;
        this.personId = personId;
        this.workHour = workHour;
    }

    public Details() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    public Long getWorkHour() {
        return workHour;
    }

    public void setWorkHour(Long workHour) {
        this.workHour = workHour;
    }
}