package cn.bdqn.demo.mapper;

import cn.bdqn.demo.pojo.TData;

import java.util.List;

public interface TDataMapper {
    int deleteByPrimaryKey(Integer dataId);

    int insert(TData record);

    int insertSelective(TData record);

    TData selectByPrimaryKey(Integer dataId);

    List<TData> selectAll();

    int updateByPrimaryKeySelective(TData record);

    int updateByPrimaryKey(TData record);
}