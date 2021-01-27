package com.itheima.service.impl;

import com.itheima.domain.Storage;
import com.itheima.mapper.StorageMapper;
import com.itheima.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("storageService")
public class StorageServiceImpl implements StorageService {

    @Autowired
    private StorageMapper storageMapper;

    @Override
    public void addStorageshop(Storage storage) {
        storageMapper.addStorageshop(storage);
    }

    @Override
    public Storage findStorage(int userid, String bookshopid) {
        Storage storage = storageMapper.findStorage(userid, bookshopid);
        return storage;
    }

    @Override
    public void updateStorageshop(Storage storage) {
        storageMapper.updateStorageshop(storage);
    }
}




