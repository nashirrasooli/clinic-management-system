package com.example.backend.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
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
