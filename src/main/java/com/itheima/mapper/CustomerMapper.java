package com.itheima.mapper;

import com.itheima.domain.Customer;

import java.util.List;

public interface CustomerMapper {

    void insert(Customer customer);

    List<Customer> selects(int id);//根据客户id查询客户信息
}
