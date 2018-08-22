package cn.bdqn.demo.controller;

import cn.bdqn.demo.common.CommonResp;
import cn.bdqn.demo.pojo.TGroupBase;
import cn.bdqn.demo.service.GroupService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

/**
 *
 **/
@Controller
public class GroupController {

    @Resource
    private GroupService groupService;

    @RequestMapping(value = "/groupBase", method = RequestMethod.POST)
    public CommonResp groupBase(TGroupBase tGroupBase){
        return groupService.groupBase(tGroupBase);
    }
}
