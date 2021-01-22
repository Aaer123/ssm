package com.itheima.controller;

import com.itheima.domain.Customer;
import com.itheima.service.CustomerService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("customer")
public class CustomerController {


    @Autowired
    private CustomerService customerService;

    @RequestMapping("insert")
    public String insert(Customer customer){
        customerService.insert(customer);
        System.out.println(customer);
        return "toinsert";
    }

/*    @RequestMapping("selects")
    public String selects(int id){
        Customer customer = customerService.selects(id);
        int userid = customer.getUserid();
        String kuser = customer.getKuser();
        String ktelphone = customer.getKtelphone();
        String khlb = customer.getKhlb();
        String khemial = customer.getKhemial();
        String khagt = customer.getKhagt();
        Date kcreatetime = customer.getKcreatetime();
        System.out.println(userid);
        System.out.println(customer);
        return "toselects";*

 */

    @ResponseBody//直接返回json
    @RequestMapping("selects")
    public ModelAndView selects(int id) {
        List<Customer> customerList = customerService.selects(id);
        System.out.println(customerList);
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("customerList",customerList);
        modelAndView.setViewName("customerList");
        return modelAndView;
    }

}
