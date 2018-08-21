package cn.bdqn.demo.service.impl;

import cn.bdqn.demo.common.CommonResp;
import cn.bdqn.demo.mapper.TGroupMapper;
import cn.bdqn.demo.pojo.TGroup;
import cn.bdqn.demo.service.CompanySignService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 *
 **/
@Service
public class CompanySignServiceImpl implements CompanySignService {

    @Resource
    private TGroupMapper tGroupMapper;

    @Override
    public CommonResp<TGroup> companySignin() {
        TGroup tGroup = tGroupMapper.selectByPrimaryKey(1L);
        System.out.println(tGroup.getGrName());
        return CommonResp.getSuccessResp(tGroup);
    }

    @Override
    public CommonResp companySignup(TGroup tGroup) {
        int count = tGroupMapper.insert(tGroup);
        if (count != 1) {
            throw new RuntimeException("t_group添加数据失败");
        }
        return CommonResp.getSuccessResp(Boolean.TRUE);
    }
}
