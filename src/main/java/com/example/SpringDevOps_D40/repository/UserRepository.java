package com.example.SpringDevOps_D40.repository;

import com.example.SpringDevOps_D40.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
