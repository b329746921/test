package cn.bdqn.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 **/
@Controller
public class PageController {
    /**
     * 跳转到企业登录页面
     */
    @RequestMapping(value = "/signin", method = RequestMethod.GET)
    public String toCompanySignin(){
        return "signin";
    }

    /**
     * 跳转到企业注册页面
     */
    @RequestMapping(value = "/signup", method = RequestMethod.GET)
    public String toCompanySignup(){
        return "signup";
    }

    /**
     * 跳转到企业申报系统主界面
     */
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String toIndex(){
        return "index";
    }

    /**
     * 跳转到企业基本信息申报
     */
    @RequestMapping(value = "/groupBase", method = RequestMethod.GET)
    public String toGroupBase(){
        return "group_base";
    }

    /**
     * 跳转到在岗人员信息
     */
    @RequestMapping(value = "/personList", method = RequestMethod.GET)
    public String toPersonList(){
        return "person_list";
    }

    /**
     * 跳转到添加人员页面
     */
    @RequestMapping(value = "/addPerson", method = RequestMethod.GET)
    public String toAddPerson(){
        return "add_person";
    }
}
