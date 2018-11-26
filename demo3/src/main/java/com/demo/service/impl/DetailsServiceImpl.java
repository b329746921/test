package com.demo.service.impl;

import com.demo.mapper.DetailsMapper;
import com.demo.mapper.EmployeeMapper;
import com.demo.mapper.ProjectMapper;
import com.demo.pojo.Details;
import com.demo.pojo.Employee;
import com.demo.pojo.Project;
import com.demo.service.DetailsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author banzijian
 * @date 2018/11/26
 **/
@Service
public class DetailsServiceImpl implements DetailsService {
    @Resource
    private DetailsMapper detailsMapper;

    @Override
    public boolean addDetails(Details details){
        int i = detailsMapper.insertSelective(details);
        if (i != 1) {
            return false;
        }
        return true;
    }

    @Override
    public boolean modDetails(Details details){
        int i = detailsMapper.updateByPrimaryKeySelective(details);
        if (i != 1) {
            return false;
        }
        return true;
    }

    @Override
    public boolean remDetails(Details details){
        int i = detailsMapper.deleteByPrimaryKey(details.getId());
        if (i != 1) {
            return false;
        }
        return true;
    }
}
