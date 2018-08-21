package cn.bdqn.demo.mapper;

import cn.bdqn.demo.pojo.TUpload;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TUploadMapper {
    int deleteByPrimaryKey(Long fileId);

    int insert(TUpload record);

    int insertSelective(TUpload record);

    TUpload selectByPrimaryKey(Long fileId);

    int updateByPrimaryKeySelective(TUpload record);

    int updateByPrimaryKey(TUpload record);
}