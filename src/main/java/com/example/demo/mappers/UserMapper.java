package com.example.demo.mappers;

import com.example.demo.dtos.UserDTO;
import com.example.demo.entities.User;

public class UserMapper {
    public static UserDTO mapToUserDTO(User user) {
        return new UserDTO(user.getId(), user.getEmail(), user.getName(), user.getPassword());
    }

    public static User mapToUser(UserDTO userDTO) {
        return new User(userDTO.getId(), userDTO.getEmail(), userDTO.getName(), userDTO.getPassword());
    }
}
