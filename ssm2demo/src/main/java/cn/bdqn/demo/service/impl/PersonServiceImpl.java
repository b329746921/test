package cn.bdqn.demo.service.impl;

import cn.bdqn.demo.common.CommonResp;
import cn.bdqn.demo.mapper.TPersonMapper;
import cn.bdqn.demo.pojo.TPerson;
import cn.bdqn.demo.service.PersonService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 *
 **/
@Service
public class PersonServiceImpl implements PersonService {

    @Resource
    private TPersonMapper tPersonMapper;

    @Override
    public CommonResp<PageInfo<TPerson>> getPersonPage(Integer pageNo, Integer pageSize) {
        PageHelper.startPage(pageNo, pageSize);
        Page<TPerson> tPersonPage = tPersonMapper.selectByPage();
        PageInfo<TPerson> pageInfo = new PageInfo<TPerson>(tPersonPage);
        return CommonResp.getSuccessResp(pageInfo);
    }
}
