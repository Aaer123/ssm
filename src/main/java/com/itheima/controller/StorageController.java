package com.itheima.controller;

import com.itheima.domain.GrossShop;
import com.itheima.domain.Storage;
import com.itheima.mapper.GrossShopMapper;
import com.itheima.mapper.StorageMapper;
import com.itheima.service.GrossShopService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.List;

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
     * 功能实现：从进货单中查询到客户id，并且把商品进货单的信息及数量存入库存表
     * <p>
     * 当要查询的对象为空时不要抛出空指针异常，这是记录异常问题解决
     * <p>
     * <p>
     * session 存单个用户；ModelAndView：存放多个，适合用集合
     */
    @RequestMapping("addStorageshop")
    public String addStorageshop(int userid) {
        /*从进货单Service层查询到客户id*/
        List<GrossShop> grossShopList = grossShopService.grosshopselect(userid);
        if (grossShopList != null) {
            for (GrossShop grossShop : grossShopList) {
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
                /**
                 * 条件：判断是否同个客户
                 * 商品数量累加
                 *
                 * 数据不能互通；一个客户一个空间
                 *
                 *    第一种方案：
                 *    ①、库存中定义查询库存单，如果是A客户，商品款号是6200031，获取原来的数量跟存在的客户进货单的数量进行相加
                 *    ②、如果是客户B，进货的商品款号是6200031，这里的客户不一样，另外存一条记录
                 *    ③、宗旨根据客户编号、商品款号查询出这张库存单据，（唯一）查询到进货的这个客户；如果没有查到，就是第一次入库，没有存在这个客户的单据
                 *    ④、修改单据数据，更新数量
                 *    ⑤、特殊：客户一致商品数量累加，不另外存放一条记录
                 *
                 *
                 *    第二种方案：
                 *    ①、在mapper中定义方法：storage findStorage（int userid，String bookshopid）查询到客户id，商品款号
                 *    ②、在mapper在定义一个修改方法：void updateStorageshop（Storage storage）
                 *
                 *
                 *    第三种方案：进货单——————入库单，直接在GrossShop注入入库表做关联，查询到storageId获取单据
                 *
                 *
                 * */

         /*   Storage storage =   storageMapper.findStorage(userid,bookshopid);
            if( storage == null){
                *//*将商品进货信息存入库存表*//*
                storageMapper.addStorageshop(new Storage(bookid,bookname,userid,kuser,bookshopid,bookage,bboklb,jhsl,jhje));
                System.out.println("当前商品信息存入库存表");
            }else {
                storage.setJhsl(storage.getJhsl()+jhsl);
                storageMapper.updateStorageshop(storage);//更新
            }


                return "toaddStorageshop";

        }else{

            return "add";*/
                Storage storage = storageMapper.findStorage(userid, bookshopid);
                if (storage == null) {
                    storageMapper.addStorageshop(new Storage(bookid, bookname, userid, kuser, bookshopid, bookage, bboklb, jhsl, jhje));
                    System.out.println("当前商品信息存入库存表");
                } else {
                    storage.setJhsl(storage.getJhsl() + jhsl);
                    storageMapper.updateStorageshop(storage);
                }
                return "toaddStorageshop";
            }
        } else {
            return "add";
        }
        return "add";
    }
}

