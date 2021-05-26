package com.zqm.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int userID;
    private String username;
    private String password;
    private int age;
    private String gender;
    private String tel;
}
