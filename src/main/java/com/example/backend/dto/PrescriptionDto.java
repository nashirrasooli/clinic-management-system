package com.example.backend.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class PrescriptionDto {

    private Long id;

    @NotNull
    private Long appointmentId;

    @NotBlank
    private String medication;

    @NotBlank
    private String dosage;

    private String instructions;
}
