package cn.bdqn.demo.mapper;

import cn.bdqn.demo.pojo.TGroupBase;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TGroupBaseMapper {
    int deleteByPrimaryKey(Long baseId);

    int insert(TGroupBase record);

    int insertSelective(TGroupBase record);

    TGroupBase selectByPrimaryKey(Long baseId);

    int updateByPrimaryKeySelective(TGroupBase record);

    int updateByPrimaryKey(TGroupBase record);
}