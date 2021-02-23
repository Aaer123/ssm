package com.itheima.service.impl;

import com.itheima.domain.User;
import com.itheima.mapper.UserMapper;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User login(String username, String password) {
        return userMapper.login(username, password);
    }

    @Override
    public boolean register(User user) {
        //不存在进行注册
        if (userMapper.getUser(user.getUsername()) == null) {
            //进行注册
            userMapper.register(user);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public User getUser(String username) {
        User user = userMapper.getUser(username);
        return user;
    }

    @Override
    public boolean setPasswords(User user) {
        //查询到该用户名，进行修改密码
        if (userMapper.getUser(user.getUsername()) != null) {
            userMapper.setPasswords(user);
            System.out.println(user);
            //修改成功
            return true;
        } else {
            return false;
        }

    }

    @Override
    public boolean userDelete(String username) {
        //查询到用户名，进行删除
        if (userMapper.getUser(username)!=null){
            userMapper.userDelete(username);
            System.out.println(username);

            //删除成功
            return true;
        }else{
            return  false;
        }
    }

    @Override
    public List<User> findAlls() {
        return userMapper.findAlls();
    }

    @Override
    public List<User> seleces(int id) {
        return userMapper.seleces(id);
    }
}
