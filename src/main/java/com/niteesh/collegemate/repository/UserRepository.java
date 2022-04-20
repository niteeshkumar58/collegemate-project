package com.niteesh.collegemate.repository;

import com.niteesh.collegemate.entity.College;
import com.niteesh.collegemate.entity.User;
import com.niteesh.collegemate.entity.Work;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
@Repository
public interface CollegeRepository extends JpaRepository<College, Integer> {
}
@Repository
public interface WorkRepository extends JpaRepository<Work, Integer> {
}
@Repository
public interface LikedRepository extends JpaRepository<User, Integer> {
}
@Repository
public interface LikedByRepository extends JpaRepository<User, Integer> {
}
@Repository
public interface InterestedInRepository extends JpaRepository<User, Integer> {
}