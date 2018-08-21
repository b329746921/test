package cn.bdqn.demo.mapper;

import cn.bdqn.demo.pojo.TPerson;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TPersonMapper {
    int deleteByPrimaryKey(Long peId);

    int insert(TPerson record);

    int insertSelective(TPerson record);

    TPerson selectByPrimaryKey(Long peId);

    int updateByPrimaryKeySelective(TPerson record);

    int updateByPrimaryKey(TPerson record);
}