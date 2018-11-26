package com.demo.controller;

import com.alibaba.fastjson.JSON;
import com.demo.pojo.Show;
import com.demo.service.ShowService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author banzijian
 * @date 2018/11/26
 **/
@RestController
public class ShowController {
    @Resource
    private ShowService showService;

    @GetMapping("/list")
    public List<Show> list(){
        List<Show> showList = showService.getShowList();
        return showList;
    }
}
