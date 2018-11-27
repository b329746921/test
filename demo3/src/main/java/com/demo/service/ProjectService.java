package com.demo.service;

import com.demo.pojo.Project;

import java.util.List;

/**
 * @author banzijian
 * @date 2018/11/26
 **/
public interface ProjectService {
    List<Project> getProjectList();

    Project getProject(Long id);

    boolean addProject(Project project);

    boolean modProject(Project project);

    boolean remProject(Long id);
}
