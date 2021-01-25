package com.itheima.controller;


import com.itheima.domain.User;
import com.itheima.mapper.UserMapper;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /*注入用户数据层*/
    @Autowired
    private UserMapper userMapper;



    @RequestMapping("login")
    public String login(String username, String password,ModelAndView modelAndView) {
        User user = userService.login(username, password);
        System.out.println(username);
        System.out.println(password);
        if (user != null) {
            return "accountList";
        } else {
            return "login";
        }
    }

    @RequestMapping("register")
    public String register(User user){

        boolean register = userService.register(user);
        System.out.println(register);
        System.out.println(user);
        //注册成功：返回登录页面
        //注册失败：返回注册页面
        return userService.register(user)?"login":"register";
    }

    @RequestMapping("setPasswords")
    public String setPasswords(User user){
        boolean setPasswords = userService.setPasswords(user);
        System.out.println(setPasswords);
        System.out.println(user);
        return "tosetPasswords";
    }

    @RequestMapping("userDelete")
    public String userDelete(String username){
        boolean userDelete = userService.userDelete(username);
        System.out.println(userDelete);
        System.out.println(username);
        return "touserDelete";
    }

    @RequestMapping("/findAlls")
    public ModelAndView findAlls(){
        List<User> userList = userService.findAlls();
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("userList",userList);
        modelAndView.setViewName("userList");
        System.out.println(userList);
        return modelAndView;
    }
}
