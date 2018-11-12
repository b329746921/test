package com.demo.demo2.service;

import com.demo.demo2.pojo.Goods;

import java.util.List;

/**
 * @author banzijian
 * @date 2018/11/12
 **/
public interface GoodsService {
    List<Goods> queryGoodsByDistrict(int district);

    Goods queryGoodsById(long id);

    boolean updateGoodsById(Goods goods);
}
