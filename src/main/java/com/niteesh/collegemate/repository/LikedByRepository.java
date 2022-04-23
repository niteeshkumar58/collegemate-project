package com.niteesh.collegemate.repository;

import com.niteesh.collegemate.entity.LikedBy;
import com.niteesh.collegemate.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LikedByRepository extends JpaRepository<LikedBy, Integer> {
}
