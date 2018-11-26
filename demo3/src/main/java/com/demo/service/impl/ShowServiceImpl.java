package com.demo.service.impl;

import com.demo.mapper.ShowMapper;
import com.demo.pojo.Show;
import com.demo.service.ShowService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author banzijian
 * @date 2018/11/26
 **/
@Service
public class ShowServiceImpl implements ShowService {
    @Resource
    private ShowMapper showMapper;

    @Override
    public List<Show> getShowList(){
        return showMapper.getShowList();
    }
}
