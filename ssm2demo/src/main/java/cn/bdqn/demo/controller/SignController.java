package cn.bdqn.demo.controller;

import cn.bdqn.demo.common.CommonResp;
import cn.bdqn.demo.pojo.TGroup;
import cn.bdqn.demo.service.GroupService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 **/
@RestController
public class SignController {

    @Resource
    private GroupService groupService;

    /**
     * 企业登录
     */
    @RequestMapping(value = "/signin", method = RequestMethod.POST)
    public CommonResp groupSignin(TGroup tGroup, HttpServletRequest request, HttpServletResponse response){
        if (tGroup == null || tGroup.getGrCode() == null || tGroup.getGrPassword() == null) {
            System.out.println("参数错了");
        }
        CommonResp<TGroup> resp = groupService.groupSignin(tGroup);
        Cookie cookie = new Cookie("grId", resp.getData().getGrId().toString());
        response.addCookie(cookie);
        return resp;
    }


    /**
     * 企业注册
     */
    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    public CommonResp groupSignup(TGroup tGroup){
        return groupService.groupSignup(tGroup);
    }
}
