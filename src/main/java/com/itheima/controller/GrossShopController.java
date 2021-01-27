package com.itheima.controller;

import com.itheima.domain.GrossShop;
import com.itheima.service.CustomerService;
import com.itheima.service.GrossShopService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@Controller
@RequestMapping("grossshop")
public class GrossShopController {

    //注入进货业务层
    @Autowired
    private GrossShopService grossShopService;

    //注入客户业务层
    @Autowired
    private CustomerService customerService;



    @RequestMapping("grossshopadd")
    public String Grossshopadd(GrossShop grossShop) {
       grossShopService.grosshopadd(grossShop);
        System.out.println(grossShop);
        return "togross";
    }
    @RequestMapping("grosshopselect")
    public ModelAndView grosshopselect(int userid){
        List<GrossShop> grossShopList = grossShopService.grosshopselect(userid);
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("grossShopList",grossShopList);
        modelAndView.setViewName("grossShopList");
        System.out.println(grossShopList);
        return modelAndView;
    }
}
