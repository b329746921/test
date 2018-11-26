package com.demo.service;

import com.demo.pojo.Details;

/**
 * @author banzijian
 * @date 2018/11/26
 **/
public interface DetailsService {
    boolean addDetails(Details details);

    boolean modDetails(Details details);

    boolean remDetails(Details details);
}
