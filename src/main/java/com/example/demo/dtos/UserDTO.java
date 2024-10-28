package com.example.demo.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    private String id;
    private String email;
    private String name;
    private String password;

    @Override
    public String toString() {
        return "UserDTO: \n" +
                "id: " + id + "\n" +
                "email: " + email + "\n" +
                "name: " + name + "\n" +
                "password: " + password;
    }
}
