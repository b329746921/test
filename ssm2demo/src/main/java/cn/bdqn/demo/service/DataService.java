package cn.bdqn.demo.service;

import cn.bdqn.demo.common.CommonResp;
import cn.bdqn.demo.common.DataTypeEnum;
import cn.bdqn.demo.pojo.TData;

import java.util.List;

/**
 *
 **/
public interface DataService {
    List<TData> getDataAll();

    CommonResp<List<TData>> getDataList(DataTypeEnum dataTypeEnum);
}
