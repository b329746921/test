package com.demo.controller;

import com.demo.service.ShowService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;

/**
 * @author banzijian
 * @date 2018/11/26
 **/
@Controller
public class PageController {
    @Resource
    private ShowService showService;

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/project")
    public String toProject(){
        return "project";
    }

    @GetMapping("/employee")
    public String toEmployee(){
        return "employee";
    }
}
