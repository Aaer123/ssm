package com.itheima.mapper;

import com.itheima.domain.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {


    User login(@Param("username") String username,@Param("password") String password);//登录：@Param传参数

    void register(User user);//注册

    User getUser(String username);//查询是否有同名的用户

    void setPasswords(User user);//修改密码

    void userDelete(String username);//删除

    List<User> findAlls();//返回集合类型

}
