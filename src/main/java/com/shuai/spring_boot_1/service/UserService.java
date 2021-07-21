package com.shuai.spring_boot_1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shuai.spring_boot_1.domain.User;
import com.shuai.spring_boot_1.mapper.UserMapper;

import javax.annotation.Resource;

@Service
public class UserService {
    
    @Resource
    private UserMapper userMapper;
    
    public void insert(){
        User user = new User();
        user.setId(2);
        user.setName("lisi");
       // userMapper.insert(user);
        System.out.println("插入成功");
    }

}