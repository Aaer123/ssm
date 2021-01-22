package com.itheima.service.impl;

import com.itheima.domain.Shop;
import com.itheima.mapper.ShopMapper;
import com.itheima.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "shopService")
public class ShopServiceImpl implements ShopService {


    @Autowired
    private ShopMapper shopMapper;

    @Override
    public void ShopAdd(Shop shop) {
        shopMapper.ShopAdd(shop);
    }
}
