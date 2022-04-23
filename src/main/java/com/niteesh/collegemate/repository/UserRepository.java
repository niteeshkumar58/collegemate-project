package com.niteesh.collegemate.repository;

import com.niteesh.collegemate.entity.College;
import com.niteesh.collegemate.entity.User;
import com.niteesh.collegemate.entity.Work;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}