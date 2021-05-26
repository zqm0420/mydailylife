package com.zqm.service;

import com.zqm.pojo.User;

import java.util.List;

public interface UserService {
    int register(User user);

    int deleteByUserID(int userID);

    int updateUser(User user);

    User queryByUserID(int userID);

    List<User> queryAllUser();

    User login(String username, String password);
}
