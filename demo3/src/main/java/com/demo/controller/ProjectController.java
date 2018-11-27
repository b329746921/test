package com.demo.controller;

import com.demo.pojo.Project;
import com.demo.service.ProjectService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author banzijian
 * @date 2018/11/26
 **/
@RestController
public class ProjectController {
    @Resource
    private ProjectService projectService;

    @GetMapping("/project/list")
    public List<Project> getProjectList(){
        return projectService.getProjectList();
    }

    @GetMapping("/project/get")
    public Project getProject(Long id){
        return projectService.getProject(id);
    }

    @PostMapping("/project/add")
    public boolean addProject(Project project){
        return projectService.addProject(project);
    }

    @PostMapping("/project/mod")
    public boolean modProject(Project project){
        return projectService.modProject(project);
    }

    @PostMapping("/project/rem")
    public boolean remProject(Long id){
        return projectService.remProject(id);
    }
}
