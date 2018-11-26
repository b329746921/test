package com.demo.controller;

import com.demo.pojo.Details;
import com.demo.service.DetailsService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author banzijian
 * @date 2018/11/26
 **/
@RestController
public class DetailsController {
    @Resource
    private DetailsService detailsService;

    @PostMapping("/details/add")
    public boolean addDetails(Details details){
        return detailsService.addDetails(details);
    }

    @PostMapping("/details/mod")
    public boolean modDetails(Details details){
        return detailsService.modDetails(details);
    }

    @PostMapping("/details/rem")
    public boolean remDetails(Details details){
        return detailsService.remDetails(details);
    }
}
