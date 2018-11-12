package com.demo.demo2.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.demo.demo2.common.DistrictEnum;
import com.demo.demo2.pojo.Goods;
import com.demo.demo2.service.GoodsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import javax.annotation.Resource;
import java.util.*;

/**
 * @author banzijian
 * @date 2018/11/12
 **/
@RestController
public class GoodsController {
    private static final Logger LOGGER = LogManager.getLogger();

    @Resource
    private GoodsService goodsService;

    @GetMapping("getDistrict")
    public Map getDistrict(){
        Map<Integer, String> result = new HashMap<>();
        for (DistrictEnum value : DistrictEnum.values()) {
            result.put(value.getDistrictCode(), value.getDistrictName());
        }
        return result;
    }

    @GetMapping("/{goodsdistrict}")
    public List<Goods> queryGoods(@PathVariable int goodsdistrict){
        if (goodsdistrict < 1 || goodsdistrict > 5) {
            LOGGER.error("goodsdistrict只能在1-5之间, goodsdistrict: {}", goodsdistrict);
            return null;
        }
        return goodsService.queryGoodsByDistrict(goodsdistrict);
    }

    @GetMapping("getByid/{id}")
    public Goods queryGoods(@PathVariable long id){
        return goodsService.queryGoodsById(id);
    }

    @PostMapping("update")
    public boolean updateGoods(Goods goods){
        return goodsService.updateGoodsById(goods);
    }
}
