package com.spring_security.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    @NotNull(message = "Id cannot be null")
    private int id;
    @NotEmpty(message = "Name cannot be empty or blank")
    private String name;
    @NotEmpty(message = "Name cannot be empty or blank")
    @Email(message = "Email should be valid", regexp = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$")
    private String email;
    @NotEmpty(message = "Name cannot be empty or blank")
    private String username;
    @NotEmpty(message = "Name cannot be empty or blank")
    private String password;
    @NotEmpty(message = "Name cannot be empty or blank")
    private String role;
}
