package com.itheima.mapper;

import com.itheima.domain.Storage;

public interface StorageMapper {

    /**进货单的数据放入库存表*/

    void addStorageshop(Storage storage);
}