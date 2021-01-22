package com.itheima.controller;

import com.itheima.domain.Account;
import com.itheima.service.AccountService;
import com.itheima.service.impl.AccountServiceImpl;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    //保存
    @RequestMapping(value = "/save",produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String save(Account account){
        Integer id = account.getId();
        accountService.save(account);
        System.out.println(account);
        return "保存成功";
    }


    //查询所有
    @RequestMapping("/findAll")
    public ModelAndView findAll(){
        List<Account> accountList = accountService.findAll();
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("accountList",accountList);
        modelAndView.setViewName("accountList");
        return modelAndView;
    }

    //修改
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public String update(@ModelAttribute("u") Account u, String name, double money){
        System.out.println(name);
        System.out.println(money);
        System.out.println(u.getMoney());
        accountService.update(u);
        return "修改成功";
    }
    //删除
    @RequestMapping("delete")
    @ResponseBody//不进行页面跳转
    public String delete(int id){
        return accountService.delete(id)?"to update":"to date";
    }
}
