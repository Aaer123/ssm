package com.itheima.mapper;

import com.itheima.domain.Storage;
import org.apache.ibatis.annotations.Param;


public interface StorageMapper {

    /**进货单的数据放入库存表*/

    void addStorageshop(Storage storage);


    Storage findStorage(@Param("userid") int userid, @Param("bookshopid") String bookshopid);


    void updateStorageshop(Storage storage);
}