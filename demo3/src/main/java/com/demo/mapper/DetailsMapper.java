package com.demo.mapper;

import com.demo.pojo.Details;

public interface DetailsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Details record);

    int insertSelective(Details record);

    Details selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Details record);

    int updateByPrimaryKey(Details record);
}