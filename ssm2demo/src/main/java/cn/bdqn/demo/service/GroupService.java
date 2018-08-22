package cn.bdqn.demo.service;

import cn.bdqn.demo.common.CommonResp;
import cn.bdqn.demo.pojo.TGroup;
import cn.bdqn.demo.pojo.TGroupBase;

/**
 * @author banzijian
 * @date 2018/08/21
 **/
public interface GroupService {

    CommonResp groupSignin();

    CommonResp groupSignup(TGroup tGroup);

    CommonResp groupBase(TGroupBase tGroupBase);
}
