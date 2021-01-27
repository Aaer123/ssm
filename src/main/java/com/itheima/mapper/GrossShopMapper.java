package com.itheima.mapper;

import com.itheima.domain.GrossShop;

import java.util.List;

public interface GrossShopMapper {

    /**
     * grossShop :进货单
     */
    void grosshopadd(GrossShop grossShop);

    /**
    *
    *根据客户id查询进货单
    *
    */
    List<GrossShop> grosshopselect(int userid);
}

