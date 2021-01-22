package com.itheima.service.impl;

import com.itheima.domain.Customer;
import com.itheima.mapper.CustomerMapper;
import com.itheima.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "customerService")
public class CustomerServiceimpl implements CustomerService {

        @Autowired
        private CustomerMapper customerMapper;

    @Override
    public void insert(Customer customer) {
        customerMapper.insert(customer);
    }

    @Override
    public List<Customer> selects(int id) {
        List<Customer> customerList = customerMapper.selects(id);
        return customerList;
    }
}
