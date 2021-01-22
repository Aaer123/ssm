package com.itheima.service;

import com.itheima.domain.Account;

import java.util.List;

public interface AccountService {

    void save(Account account);//保存

    List<Account> findAll();//查询

    void update(Account account);//修改

    boolean delete(int id);

}
