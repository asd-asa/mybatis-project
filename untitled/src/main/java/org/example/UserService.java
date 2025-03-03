package com.example.service;

import com.example.mapper.UserMapper;
import com.example.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> getAllUsers() {
        return userMapper.selectAll();
    }

    public void deleteUserById(int id) {
        userMapper.deleteById(id);
    }

    public void addUser(User user) {
        userMapper.insertUser(user);
    }

    public void updateUserSalById(int id, double sal) {
        userMapper.updateSalById(id, sal);
    }
}