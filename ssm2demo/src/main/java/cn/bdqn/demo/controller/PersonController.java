package cn.bdqn.demo.controller;

import cn.bdqn.demo.common.CommonResp;
import cn.bdqn.demo.pojo.TPerson;
import cn.bdqn.demo.service.PersonService;
import com.github.pagehelper.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 *
 **/
@RestController
public class PersonController {

    @Resource
    private PersonService personService;

    @RequestMapping(value = "/getPersonList", method = RequestMethod.GET)
    public CommonResp getPersonPage(Integer pageNo, Integer pageSize){
        if (pageNo == null) {
            pageNo = 1;
        }
        if (pageSize == null) {
            pageSize = 20;
        }
        return personService.getPersonPage(pageNo, pageSize);
    }
}
