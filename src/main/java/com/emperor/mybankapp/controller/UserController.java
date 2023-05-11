package com.emperor.mybankapp.controller;

import com.emperor.mybankapp.entity.User;
import com.emperor.mybankapp.payload.UserRequest;
import com.emperor.mybankapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping
    public User registerUser(@RequestBody UserRequest userRequest){
        return userService.registerUser(userRequest);
    }

    @GetMapping
    public List<User> getAllUsers(){
        return userService.fetchAllRegisteredUsers();
    }

    @GetMapping("/{id}")
    public User getSingleUser(@PathVariable("id") Long id){
        return userService.fetchSingleUser(id);
    }

    @PutMapping("/{id}")
    public User updateSingleUser(@PathVariable("id") Long id, @RequestBody UserRequest userRequest){
        return userService.updateUser(userRequest, id);
    }

//    @DeleteMapping("/{id}")
//    public String deleteUser(@PathVariable Long id){
//        userService.deleteUser(id);
//        return "Deleted";
//
//    }
@DeleteMapping("/{id}")
public String deleteUser(@PathVariable Long id){
    return userService.deleteUser(id);
}
}
