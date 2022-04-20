package com.niteesh.collegemate.controller;

import com.niteesh.collegemate.entity.User;
import com.niteesh.collegemate.entity.UserData;
import com.niteesh.collegemate.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/")
    public String home(){
        return "welocome to home page of collegemate application!!!";
    }

    @PostMapping(value = "/addNewUser")
    public UserData addNewUser(@RequestBody UserData userData){
        return userService.addNewUser(userData);
    }
}
