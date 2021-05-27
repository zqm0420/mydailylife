package com.zqm.service;

import com.zqm.dao.UserMapper;
import com.zqm.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserMapper userMapper;

//    public void setUserMapper(UserMapper userMapper) {
//        this.userMapper = userMapper;
//    }

    @Override
    public int register(User user) {
        return userMapper.register(user);
    }

    @Override
    public int deleteByUserID(int userID) {
        return userMapper.deleteByUserID(userID);
    }

    @Override
    public int updateUser(User user) {
        return userMapper.updateUser(user);
    }

    @Override
    public User queryByUserID(int userID) {
        return userMapper.queryByUserID(userID);
    }

    @Override
    public List<User> queryAllUser() {
        return userMapper.queryAllUser();
    }

    @Override
    /*
    登录业务：如果username，password都和数据库匹配，则返回对应user，否则返回None
     */
    public User login(String username, String password) {
        return userMapper.login(username, password);
    }
}
