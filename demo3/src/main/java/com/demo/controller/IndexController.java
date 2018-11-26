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
public class IndexController {
    @Resource
    private ShowService showService;

    @GetMapping("/")
    public String index(){
        return "index";
    }
}
