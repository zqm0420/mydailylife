package com.zqm.controller;


import com.zqm.pojo.User;
import com.zqm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @Autowired
    @Qualifier("userServiceImpl")
    private UserService userService;

    @PostMapping("/login")
    public String login(Model model, String username, String password){
        User loginUser = userService.login(username, password);
        if (loginUser==null){
            return "redirect:/login.jsp";
        }
        model.addAttribute("loginUser", loginUser);
        return "home";
    }

}
