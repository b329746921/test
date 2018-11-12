package com.demo.demo2.service.impl;

import com.demo.demo2.mapper.GoodsMapper;
import com.demo.demo2.pojo.Goods;
import com.demo.demo2.service.GoodsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author banzijian
 * @date 2018/11/12
 **/
@Service
public class GoodsServiceImpl implements GoodsService {
    @Resource
    private GoodsMapper goodsMapper;

    @Override
    public List<Goods> queryGoodsByDistrict(int district) {
        return goodsMapper.selectByDistrict(district);
    }

    @Override
    public Goods queryGoodsById(long id) {
        return goodsMapper.selectByPrimaryKey(id);
    }

    @Override
    public boolean updateGoodsById(Goods goods) {
        int count = goodsMapper.updateByPrimaryKeySelective(goods);
        if (count != 1) {
            return false;
        }
        return true;
    }
}
