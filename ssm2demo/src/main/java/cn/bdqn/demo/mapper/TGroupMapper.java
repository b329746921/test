package cn.bdqn.demo.mapper;

import cn.bdqn.demo.pojo.TGroup;

public interface TGroupMapper {
    int deleteByPrimaryKey(Long grId);

    int insert(TGroup record);

    int insertSelective(TGroup record);

    TGroup selectByPrimaryKey(Long grId);

    TGroup signin(TGroup record);

    int updateByPrimaryKeySelective(TGroup record);

    int updateByPrimaryKey(TGroup record);
}