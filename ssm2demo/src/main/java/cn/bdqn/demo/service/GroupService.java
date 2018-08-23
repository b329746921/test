package cn.bdqn.demo.service;

import cn.bdqn.demo.common.CommonResp;
import cn.bdqn.demo.pojo.TGroup;
import cn.bdqn.demo.pojo.TGroupBase;

/**
 *
 **/
public interface GroupService {

    CommonResp groupSignin(TGroup tGroup);

    CommonResp groupSignup(TGroup tGroup);

    CommonResp groupBase(TGroupBase tGroupBase);

    CommonResp getGroupBase(TGroupBase tGroupBase);
}
