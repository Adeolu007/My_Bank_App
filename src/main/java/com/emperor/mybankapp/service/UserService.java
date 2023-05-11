package com.emperor.mybankapp.service;

import com.emperor.mybankapp.entity.User;
import com.emperor.mybankapp.payload.UserRequest;

import java.util.List;

public interface UserService {
    User registerUser(UserRequest userRequest);
    List<User> fetchAllRegisteredUsers();

    User fetchSingleUser (Long id);

    User updateUser(UserRequest userRequest, Long id);

//    void deleteUser(Long id);
String deleteUser(Long id);
}
