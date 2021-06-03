package com.zqm.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginInterceptor implements HandlerInterceptor {
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //判断什么情况下放行
        //1. 登录页面可以放行
        if (request.getRequestURI().contains("login")){
            System.out.println(request.getRequestURI());

            return true;
        }
        //2. 如果已经登录存在session可以放行
        HttpSession session = request.getSession();
        if (session.getAttribute("USER_SESSION")!=null){
            return true;
        }
        request.getRequestDispatcher("login").forward(request, response);
        return false;
    }
}
