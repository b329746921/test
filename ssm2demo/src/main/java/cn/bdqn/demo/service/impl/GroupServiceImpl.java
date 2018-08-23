package cn.bdqn.demo.service.impl;

import cn.bdqn.demo.common.CommonResp;
import cn.bdqn.demo.mapper.TGroupBaseMapper;
import cn.bdqn.demo.mapper.TGroupMapper;
import cn.bdqn.demo.pojo.TGroup;
import cn.bdqn.demo.pojo.TGroupBase;
import cn.bdqn.demo.service.GroupService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 *
 **/
@Service
public class GroupServiceImpl implements GroupService {

    @Resource
    private TGroupMapper tGroupMapper;
    @Resource
    private TGroupBaseMapper tGroupBaseMapper;

    @Override
    public CommonResp<String> groupSignin(TGroup tGroup) {
        TGroup group = tGroupMapper.signin(tGroup);
        if (group == null) {
            return CommonResp.getFailedResp();
        }
        return CommonResp.getSuccessResp("index");
    }

    @Override
    public CommonResp groupSignup(TGroup tGroup) {
        int count = tGroupMapper.insertSelective(tGroup);
        if (count != 1) {
            throw new RuntimeException("t_group添加数据失败");
        }
        return CommonResp.getSuccessResp("signin");
    }

    @Override
    public CommonResp groupBase(TGroupBase tGroupBase) {
        TGroupBase groupBase = tGroupBaseMapper.selectByGrId(tGroupBase.getGrId());
        if (groupBase == null) {
            int count = tGroupBaseMapper.insertSelective(tGroupBase);
            if (count != 1) {
                throw new RuntimeException("t_group_base添加数据失败");
            }
        } else {
            int count = tGroupBaseMapper.updateByGrIdSelective(tGroupBase);
            if (count != 1) {
                throw new RuntimeException("t_group_base修改数据失败");
            }
        }
        return CommonResp.getSuccessResp(Boolean.TRUE);
    }
}
