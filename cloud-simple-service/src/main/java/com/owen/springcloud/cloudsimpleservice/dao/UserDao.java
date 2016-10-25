package com.owen.springcloud.cloudsimpleservice.dao;

import java.util.List;
import com.owen.springcloud.cloudsimpleservice.model.User;

public interface UserDao {
    List<User> findAll();
}
