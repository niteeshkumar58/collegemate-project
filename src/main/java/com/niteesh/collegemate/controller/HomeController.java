package com.niteesh.collegemate.controller;

import com.niteesh.collegemate.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping(value = "/")
    public String home(){
        return "welocome to home page of collegemate application!!!";
    }

    @PostMapping(value = "/addNewUser")
    public User addNewUser(){
        
    }
}
