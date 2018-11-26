package com.demo.controller;

import com.demo.pojo.Project;
import com.demo.service.ProjectService;
import org.springframework.web.bind.annotation.GetMapping;
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
}
