package com.itheima.service;

import com.itheima.domain.Customer;

import java.util.List;

public interface CustomerService {

    void insert(Customer customer);

    List<Customer> selects(int id);//封装到集合，查询出来的结果放到集合当中
}
