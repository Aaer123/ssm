/**
* 进货逻辑业务层
* */
package com.itheima.service;

import com.itheima.domain.GrossShop;

import java.util.List;

public interface GrossShopService {


    /**
     * grossShop :添加进货单
     * */
    void grosshopadd(GrossShop grossShop);//进货


    /**
     * 根据进货单客户id查询到进货单转入库存单
     * */
    List<GrossShop> grosshopselect(int userid);
}
