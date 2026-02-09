package com.example.backend.dto;

import java.time.LocalDate;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;

public class PatientDto {

    private Long id;

    @NotBlank
    private String fullName;

    @NotBlank
    private String phone;

    @Past
    private LocalDate dateOfBirth;
}
