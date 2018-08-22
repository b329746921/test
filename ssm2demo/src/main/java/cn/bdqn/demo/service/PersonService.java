package cn.bdqn.demo.service;

import cn.bdqn.demo.common.CommonResp;

/**
 *
 **/
public interface PersonService {

    CommonResp getPersonPage(Integer pageNo, Integer pageSize);
}
