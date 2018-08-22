package cn.bdqn.demo.controller;

import cn.bdqn.demo.common.CommonResp;
import cn.bdqn.demo.pojo.TGroup;
import cn.bdqn.demo.service.GroupService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

/**
 *
 **/
@Controller
public class SignController {

    @Resource
    private GroupService groupService;

    /**
     * 企业登录
     */
    @RequestMapping(value = "/signin", method = RequestMethod.POST)
    public String groupSignin(){
        return "redirect:index";
    }


    /**
     * 企业注册
     */
    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    public CommonResp groupSignup(TGroup tGroup){
        System.out.println(tGroup);
        return groupService.groupSignup(tGroup);
    }
}
