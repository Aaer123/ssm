package com.itheima.controller;

import com.itheima.domain.GrossShop;
import com.itheima.domain.Storage;
import com.itheima.mapper.GrossShopMapper;
import com.itheima.mapper.StorageMapper;
import com.itheima.service.GrossShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
@RequestMapping("storage")
public class StorageController {

    /*注入进货业务层*/
    @Autowired
    private GrossShopService grossShopService;

    /*注入库存数据层*/
    @Autowired
    private StorageMapper storageMapper;


    /*进货数据层*//*
    @Autowired
    private GrossShopMapper grossShopMapper;*/


    /**
    *
    *
    * 功能实现：从进货单中查询到客户id，并且把商品进货单的信息及数量存入库存表
    *
    * 当要查询的对象为空时不要抛出空指针异常，这是记录异常问题解决
    *
    * */
    @RequestMapping("addStorageshop")
    public String addStorageshop(int userid) throws NullPointerException{

        /*从进货单Service层查询到客户id*/
        GrossShop grossShop = grossShopService.grosshopselect(userid);
        if(grossShop!=null){
            //获取图书编号
            int bookid = grossShop.getBookid();
            //获取图书名称
            String bookname = grossShop.getBookname();
            //获取客户名称
            String kuser = grossShop.getKuser();
            //获取款号
            String bookshopid = grossShop.getBookshopid();
            //获取图书年份
            Date bookage = grossShop.getBookage();
            //获取图书类别
            String bboklb = grossShop.getBboklb();
            //获取进货数量
            int jhsl = grossShop.getJhsl();
            //获取进货金额
            double jhje = grossShop.getJhje();


            /*将商品进货信息存入库存表*/
            storageMapper.addStorageshop(new Storage(bookid,bookname,userid,kuser,bookshopid,bookage,bboklb,jhsl,jhje));
            System.out.println("当前商品信息存入库存表");
            return "toaddStorageshop";
        }else{
            return "add";
        }

    }

}
