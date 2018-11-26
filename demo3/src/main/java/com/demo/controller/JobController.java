package com.demo.controller;

import com.demo.pojo.Job;
import com.demo.service.JobService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author banzijian
 * @date 2018/11/26
 **/
@RestController
public class JobController {
    @Resource
    private JobService jobService;

    @GetMapping("/job/list")
    public List<Job> getJobList(){
        return jobService.getJobList();
    }
}
