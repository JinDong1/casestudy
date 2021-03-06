package com.itcast.controller;

import com.itcast.entity.User;
import com.itcast.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
   private UserService userService;

    @RequestMapping("findAll")
    public String findAll(Model model){
        List<User> users = userService.findAll();
        System.out.println(users);
        model.addAttribute("users",users);
        return "list";
    }

}
