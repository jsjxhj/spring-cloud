package com.owen.springcloud.cloudsimpleservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.owen.springcloud.cloudsimpleservice.dao.UserDao;
import com.owen.springcloud.cloudsimpleservice.model.User;

@Service
@Transactional
public class UserService {

    @Autowired
    private UserDao userMapper;

    public List<User> searchAll() {
        List<User> list = userMapper.findAll();
        return list;
    }
}
