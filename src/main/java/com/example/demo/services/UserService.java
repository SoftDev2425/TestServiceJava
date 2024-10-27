package com.example.demo.services;

import com.example.demo.dtos.UserDTO;

import java.util.List;

public interface UserService {
    UserDTO createUser(UserDTO userDTO);
    List<UserDTO> getUsers();
}
