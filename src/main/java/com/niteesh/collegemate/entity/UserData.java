package com.niteesh.collegemate.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.criteria.CriteriaBuilder;


public class UserData {
    private User user;
    private Hobbies hobbies;
    private College college;
    private Work work;
    private InterestedIn interestedIn;
    private Liked liked;
    private LikedBy likedBy;

    public UserData(User user, Hobbies hobbies, College college, Work work, InterestedIn interestedIn, Liked liked, LikedBy likedBy) {
        this.user = user;
        this.hobbies = hobbies;
        this.college = college;
        this.work = work;
        this.interestedIn = interestedIn;
        this.liked = liked;
        this.likedBy = likedBy;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setHobbies(Hobbies hobbies) {
        this.hobbies = hobbies;
    }

    public College getCollege() {
        return college;
    }

    public void setCollege(College college) {
        this.college = college;
    }

    public Work getWork() {
        return work;
    }

    public void setWork(Work work) {
        this.work = work;
    }

    public InterestedIn getInterestedIn() {
        return interestedIn;
    }

    public void setInterestedIn(InterestedIn interestedIn) {
        this.interestedIn = interestedIn;
    }

    public Liked getLiked() {
        return liked;
    }

    public void setLiked(Liked liked) {
        this.liked = liked;
    }

    public LikedBy getLikedBy() {
        return likedBy;
    }

    public void setLikedBy(LikedBy likedBy) {
        this.likedBy = likedBy;
    }
}

