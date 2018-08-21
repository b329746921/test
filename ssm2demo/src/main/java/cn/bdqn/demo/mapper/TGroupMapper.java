package cn.bdqn.demo.mapper;

import cn.bdqn.demo.pojo.TGroup;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TGroupMapper {
    int deleteByPrimaryKey(Long grId);

    int insert(TGroup record);

    int insertSelective(TGroup record);

    TGroup selectByPrimaryKey(Long grId);

    int updateByPrimaryKeySelective(TGroup record);

    int updateByPrimaryKey(TGroup record);
}