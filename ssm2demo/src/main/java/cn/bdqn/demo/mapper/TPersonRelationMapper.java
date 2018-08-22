package cn.bdqn.demo.mapper;

import cn.bdqn.demo.pojo.TPersonRelation;

public interface TPersonRelationMapper {
    int deleteByPrimaryKey(Long reId);

    int insert(TPersonRelation record);

    int insertSelective(TPersonRelation record);

    TPersonRelation selectByPrimaryKey(Long reId);

    int updateByPrimaryKeySelective(TPersonRelation record);

    int updateByPrimaryKey(TPersonRelation record);
}