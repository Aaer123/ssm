package com.itheima.controller;

import com.itheima.domain.Shop;
import com.itheima.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/shop")
public class ShopController {

    //注入shopService层
    @Autowired
    private ShopService shopService;


    //添加
    @RequestMapping(value = "shopAdd")
    public String shopAdd(Shop shop) {
        shopService.ShopAdd(shop);
        System.out.println(shop);
        return "toShopAdd";
    }
}
