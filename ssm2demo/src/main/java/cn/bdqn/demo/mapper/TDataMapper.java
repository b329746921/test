package cn.bdqn.demo.mapper;

import cn.bdqn.demo.pojo.TData;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TDataMapper {
    int deleteByPrimaryKey(Integer dataId);

    int insert(TData record);

    int insertSelective(TData record);

    TData selectByPrimaryKey(Integer dataId);

    int updateByPrimaryKeySelective(TData record);

    int updateByPrimaryKey(TData record);
}