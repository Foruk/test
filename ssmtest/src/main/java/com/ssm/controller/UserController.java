package com.ssm.controller;

import Entity.User;
import Service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.io.UnsupportedEncodingException;

/**
 * Created by Administrator on 2016/4/24.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    private UserService userService;
    @RequestMapping("/userinfo/binding1")
    public ModelAndView binding1(Integer UserId)//使用Integer包装类型的int可以使参数绑定不会有异常,int对表单参数传过来更严格
    {
       ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("user");
        modelAndView.addObject("userid",UserId);
        return modelAndView;
    }
    @RequestMapping("/userinfo/binding2")
    public ModelAndView binding2(User user) throws UnsupportedEncodingException {
        user.setUserName(new String(user.getUserName().getBytes("ISO-8859-1"),"utf-8"));
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("user");
        modelAndView.addObject("user",user);
        return modelAndView;
    }
}
