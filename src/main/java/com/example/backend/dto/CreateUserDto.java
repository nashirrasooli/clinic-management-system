package com.example.backend.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class CreateUserDto {

    @NotBlank
    private String username;

    @NotBlank
    private String password;

    @Email
    private String email;
}
