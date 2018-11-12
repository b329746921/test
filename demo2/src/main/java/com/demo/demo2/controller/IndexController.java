package com.demo.demo2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author banzijian
 * @date 2018/11/12
 **/
@Controller
public class IndexController {
    @RequestMapping("/")
    public String bill(){
        return "bill";
    }
}
