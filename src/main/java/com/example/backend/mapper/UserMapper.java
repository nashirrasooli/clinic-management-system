package com.example.backend.mapper;

import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.example.backend.dto.UserDto;
import com.example.backend.entity.Role;
import com.example.backend.entity.User;

@Component
public class UserMapper {

    public UserDto toDto(User user) {
        UserDto dto = new UserDto();
        dto.setId(user.getId());
        dto.setUsername(user.getUsername());
        dto.setEmail(user.getEmail());

        // Map roles from Role entities to role names (strings)
        Set<String> roles = user.getRoles()
                .stream()
                .map(role -> role.getName()) // role.getName() returns String
                .collect(Collectors.toSet());

        dto.setRoles(roles);
        return dto;
    }

    public User toEntity(UserDto dto, Set<Role> roles) {
        User user = new User();
        user.setId(dto.getId()); // Only set if you're updating an existing user
        user.setUsername(dto.getUsername());
        user.setEmail(dto.getEmail());
        user.setRoles(roles);
        return user;
    }
}