package com.niteesh.collegemate.service;

import com.niteesh.collegemate.entity.*;
import com.niteesh.collegemate.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private Work work;
    @Autowired
    private User user;
    @Autowired
    private College college;
    @Autowired
    private Liked liked;
    @Autowired
    private LikedBy likedBy;
    @Autowired
    private InterestedIn interestedIn;


    @Override
    public UserData addNewUser(UserData userData) {
        user = userRepository.save(userData.getUser());
        college = userRepository.save(userData.getCollege());
        work = userRepository.save(userData.getWork());
        userRepository.save(userData.getInterestedIn());
        userRepository.save(userData.getLiked());
        userRepository.save(userData.getLikedBy();


    }
}
