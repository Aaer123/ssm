/**
* 进货逻辑业务层
* */
package com.itheima.service;

import com.itheima.domain.GrossShop;

public interface GrossShopService {


    /**
     * grossShop :添加进货单
     * */
    void grosshopadd(GrossShop grossShop);//进货


    /**
     * 根据进货单客户id查询到进货单转入库存单
     * */
    GrossShop grosshopselect(int userid);
}
