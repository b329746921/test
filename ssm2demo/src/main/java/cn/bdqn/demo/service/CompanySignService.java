package cn.bdqn.demo.service;

import cn.bdqn.demo.common.CommonResp;
import cn.bdqn.demo.pojo.TGroup;

/**
 * @author banzijian
 * @date 2018/08/21
 **/
public interface CompanySignService {

    CommonResp companySignin();

    CommonResp companySignup(TGroup tGroup);
}
