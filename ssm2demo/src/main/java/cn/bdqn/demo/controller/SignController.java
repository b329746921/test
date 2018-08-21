package cn.bdqn.demo.controller;

import cn.bdqn.demo.pojo.TGroup;
import cn.bdqn.demo.service.CompanySignService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 *
 **/
@Controller
public class SignController {

    @Resource
    private CompanySignService companySignService;

    /**
     * 企业登录
     */
    @RequestMapping("/signin")
    public void companySignin(){
        companySignService.companySignin();
    }


    /**
     * 企业注册
     */
    @RequestMapping("/signup")
    public void companySignup(TGroup tGroup){
        System.out.println(tGroup);
        companySignService.companySignup(tGroup);
    }
}
