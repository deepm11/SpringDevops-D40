package com.example.SpringDevOps_D40.service;



import com.example.SpringDevOps_D40.entity.User;
import com.example.SpringDevOps_D40.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User saveUser(String name) {
        return userRepository.save(new User(name));
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}


