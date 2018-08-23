package cn.bdqn.demo.service.impl;

import cn.bdqn.demo.common.CommonResp;
import cn.bdqn.demo.common.DataTypeEnum;
import cn.bdqn.demo.configuration.SchedulingConfig;
import cn.bdqn.demo.mapper.TDataMapper;
import cn.bdqn.demo.pojo.TData;
import cn.bdqn.demo.service.DataService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 *
 **/
@Service
public class DataServiceImpl implements DataService {

    @Resource
    private TDataMapper tDataMapper;

    /**
     * 获取所有字典值
     * @return
     */
    @Override
    public List<TData> getDataAll() {
        return tDataMapper.selectAll();
    }

    /**
     * 获取缓存中字典list
     * @param dataTypeEnum
     * @return
     */
    @Override
    public CommonResp<List<TData>> getCacheDataList(DataTypeEnum dataTypeEnum) {
        List<TData> dataList = SchedulingConfig.DATA_CONTAINER.get(dataTypeEnum.getCode());
        return CommonResp.getSuccessResp(dataList);
    }
}
