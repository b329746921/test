package cn.bdqn.demo.mapper;

import cn.bdqn.demo.pojo.TGroupBase;

public interface TGroupBaseMapper {
    int deleteByPrimaryKey(Long baseId);

    int insert(TGroupBase record);

    int insertSelective(TGroupBase record);

    TGroupBase selectByGrId(Long grId);

    int updateByGrIdSelective(TGroupBase record);

    int updateByPrimaryKey(TGroupBase record);
}