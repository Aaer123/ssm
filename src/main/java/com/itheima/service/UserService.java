package com.itheima.service;

import com.itheima.domain.User;

import java.util.List;

public interface UserService {

    User login(String usernam, String password);//登录

    boolean register(User user);//注册

    void getUser(String username);//注册是否有同名

    boolean setPasswords(User user);//修改密码

    boolean userDelete(String username);//删除

    List<User> findAlls();//查询所有


}
