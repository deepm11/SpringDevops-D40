package com.example.SpringDevOps_D40.controller;





import com.example.SpringDevOps_D40.entity.User;
import com.example.SpringDevOps_D40.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public User createUser(@RequestParam String name) {
        return userService.saveUser(name);
    }

    @GetMapping
    public List<User> getUsers() {
        return userService.getAllUsers();
    }
}
