package com.example.backend.dto;

import jakarta.validation.constraints.NotBlank;

public class DoctorDto {

    private Long id;

    @NotBlank
    private String fullName;

    @NotBlank
    private String specialization;
}
