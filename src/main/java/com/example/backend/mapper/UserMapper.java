package com.example.backend.mapper;

import java.util.Set;

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

        Set<String> roles = user.getRoles()
                .stream()
                .map(role -> role.getName().name())
                .collect(Collectors.toSet());

        dto.setRoles(roles);
        return dto;
    }

    public User toEntity(UserDto dto, Set<Role> roles) {
        User user = new User();
        user.setUsername(dto.getUsername());
        user.setRoles(roles);
        return user;
    }
}
