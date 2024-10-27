package com.example.demo.mappers;

import com.example.demo.dtos.UserDTO;
import com.example.demo.entities.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class UserMapperTest {

    UserMapper mapper;

    @Test
    void mapToUserDTO_UserDTOIdShouldEqualUserId() {
        // Arrange
        User user = new User();
        user.setId("a");

        // Act
        UserDTO userDTO = mapper.mapToUserDTO(user);

        // Assert
        assertEquals(user.getId(), userDTO.getId());
    }

    @Test
    void mapToUser_UserIdShouldEqualUserDTOId() {
        // Arrange
        UserDTO userDTO = new UserDTO();
        userDTO.setId("a");

        // Act
        User user = mapper.mapToUser(userDTO);

        // Assert
        assertEquals(userDTO.getId(), user.getId());
    }
}