package com.demo.service.impl;

import com.demo.mapper.JobMapper;
import com.demo.pojo.Job;
import com.demo.service.JobService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author banzijian
 * @date 2018/11/26
 **/
@Service
public class JobServiceImpl implements JobService {
    @Resource
    private JobMapper jobMapper;

    @Override
    public List<Job> getJobList(){
        return jobMapper.selectList();
    }
}
