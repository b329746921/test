package cn.bdqn.demo.configuration;

import cn.bdqn.demo.pojo.TData;
import cn.bdqn.demo.service.DataService;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 **/
@Configuration
@EnableScheduling
public class SchedulingConfig {
    @Resource
    private DataService dataService;
    public static Map<String, List<TData>> DATA_CONTAINER = new HashMap();

    @Scheduled(fixedRate=60 * 1000) // 每1分钟执行一次
    public void getToken() {
        List<TData> tDataList = dataService.getDataAll();
        for (TData tData : tDataList) {
            List<TData> dataList = DATA_CONTAINER.get(tData.getDataType());
            if (dataList == null) {
                dataList = new ArrayList<TData>();
            }
            dataList.add(tData);
            DATA_CONTAINER.put(tData.getDataType(), dataList);
        }
    }
}
