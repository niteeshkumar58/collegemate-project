package com.niteesh.collegemate.service;

import com.niteesh.collegemate.entity.User;
import com.niteesh.collegemate.entity.UserData;
import org.springframework.stereotype.Service;


public interface UserService {
    public UserData addNewUser(UserData userData);
}
