package com.itheima.service.impl;

import com.itheima.domain.GrossShop;

import com.itheima.mapper.GrossShopMapper;

import com.itheima.service.GrossShopService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service(value = "grossShopService")
public class GrossShopServiceImpl implements GrossShopService {

    //注入进货数据层
    @Autowired
    private GrossShopMapper grossShopMapper;


    //添加方法
    @Override
    public void grosshopadd(GrossShop grossShop) {
        grossShopMapper.grosshopadd(grossShop);
    }

    @Override
    public List<GrossShop> grosshopselect(int userid) {
        List<GrossShop> grossShopList = grossShopMapper.grosshopselect(userid);
        return grossShopList;
    }


}
