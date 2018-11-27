package com.demo.service.impl;

import com.demo.mapper.ProjectMapper;
import com.demo.pojo.Project;
import com.demo.service.ProjectService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author banzijian
 * @date 2018/11/26
 **/
@Service
public class ProjectServiceImpl implements ProjectService {
    @Resource
    private ProjectMapper projectMapper;

    @Override
    public List<Project> getProjectList(){
        return projectMapper.selectList();
    }

    @Override
    public Project getProject(Long id){
        return projectMapper.selectByPrimaryKey(id);
    }

    @Override
    public boolean addProject(Project project){
        int i = projectMapper.insertSelective(project);
        if (i != 1)
            return false;
        return true;
    }

    @Override
    public boolean modProject(Project project){
        int i = projectMapper.updateByPrimaryKeySelective(project);
        if (i != 1)
            return false;
        return true;
    }

    @Override
    public boolean remProject(Long id){
        int i = projectMapper.deleteByPrimaryKey(id);
        if (i != 1)
            return false;
        return true;
    }
}
