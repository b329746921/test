package com.demo.mapper;

import com.demo.pojo.Job;

import java.util.List;

public interface JobMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Job record);

    int insertSelective(Job record);

    Job selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Job record);

    int updateByPrimaryKey(Job record);

    List<Job> selectList();
}