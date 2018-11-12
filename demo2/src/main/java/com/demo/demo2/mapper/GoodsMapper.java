package com.demo.demo2.mapper;

import com.demo.demo2.pojo.Goods;

import java.util.List;

public interface GoodsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Goods record);

    int insertSelective(Goods record);

    Goods selectByPrimaryKey(Long id);

    List<Goods> selectByDistrict(int district);

    int updateByPrimaryKeySelective(Goods record);

    int updateByPrimaryKey(Goods record);
}