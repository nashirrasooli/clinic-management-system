package com.example.backend.service;

import java.util.List;

import com.example.backend.dto.UserDto;

public interface UserService {

    UserDto createUser(UserDto dto);

    List<UserDto> getAllUsers();

    UserDto getUserById(Long id);

    void deleteUser(Long id);
}
