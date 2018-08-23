package cn.bdqn.demo.controller;

import cn.bdqn.demo.common.CommonResp;
import cn.bdqn.demo.common.DataTypeEnum;
import cn.bdqn.demo.pojo.TData;
import cn.bdqn.demo.service.DataService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 *
 **/
@RestController
public class AjaxController {

    @Resource
    private DataService dataService;

    @RequestMapping(value = "getData", method = RequestMethod.POST)
    public CommonResp<List<TData>> getData(String code){
        return dataService.getCacheDataList(DataTypeEnum.getDataTypeEnum(code));
    }
}
