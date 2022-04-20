package com.niteesh.collegemate.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Hobbies {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int Id;
    int userId;
    String hobby;
}
