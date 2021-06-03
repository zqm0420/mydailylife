package com.zqm.controller;


import com.zqm.pojo.User;
import com.zqm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    @Qualifier("userServiceImpl")
    private UserService userService;

    @GetMapping("/home")
    public String toHome(){
        return "home";
    }

    @GetMapping("/login")
    public String toLogin(){
        return "login";
    }

    @PostMapping("/login")
    public String login(String username, String password, Model model, HttpSession session){
        User loginUser = userService.login(username, password);
        if (loginUser!=null){
            session.setAttribute("USER_SESSION", loginUser);
            return "home";
        }
        model.addAttribute("msg", "用户名或密码错误，请重新登录！");
        return "login";
    }

}
