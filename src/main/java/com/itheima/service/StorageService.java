package com.itheima.service;

import com.itheima.domain.Storage;

public interface StorageService {

    //库存添加操作
    void addStorageshop(Storage storage);


    //库存单中查询到客户id，商品款号
    Storage findStorage(int userid,String bookshopid);


    //更新数量
    void updateStorageshop(Storage storage);

}
