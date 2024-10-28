package com.example.demo.services;

import com.example.demo.dtos.UserDTO;
import com.example.demo.entities.User;
import com.example.demo.mappers.UserMapper;
import com.example.demo.repositories.UserRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import utils.TestUserListGenerator;

import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class UserServiceTest {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserServiceImplemented userService;

    UserMapper mapper;
    TestUserListGenerator usersGenerator;

    @Test
    void createUser_ReturnsUserDTO() {
        User user = new User("a", "b", "c", "d");
        UserDTO userDTO = mapper.mapToUserDTO(user);

        when(userRepository.save(Mockito.any(User.class))).thenReturn(user);

        UserDTO savedUser = userService.createUser(userDTO);

        Assertions.assertThat(savedUser).isNotNull();
        Assertions.assertThat(savedUser.getId()).isEqualTo(user.getId());
    }

    @Test
    void getUsers_ReturnsAllUsers() {
        List<User> users = usersGenerator.generateUsers(5);

        when(userRepository.findAll()).thenReturn(users);

        List<UserDTO> savedUsers = userService.getUsers();

        Assertions.assertThat(savedUsers).isNotNull();
        Assertions.assertThat(savedUsers.size()).isEqualTo(5);
    }
}