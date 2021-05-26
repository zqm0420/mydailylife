package com.zqm.dao;

import com.zqm.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {

    int register(User user);

    int deleteByUserID(int userID);

    int updateUser(User user);

    User queryByUserID(int userID);

    List<User> queryAllUser();

    User login(@Param("username") String username, @Param("password") String password);
}
