package com.example.backend.mapper;

import com.example.backend.dto.PatientDto;
import com.example.backend.entity.Patient;

public class PatientMapper {

    public static Patient toEntity(PatientDto dto) {
        Patient patient = new Patient();
        patient.setId(dto.getId());
        patient.setFullName(dto.getFullName());
        patient.setPhone(dto.getPhone());
        patient.setDateOfBirth(dto.getDateOfBirth());
        return patient;
    }

    public static PatientDto toDto(Patient patient) {
        PatientDto dto = new PatientDto();
        dto.setId(patient.getId());
        dto.setFullName(patient.getFullName());
        dto.setPhone(patient.getPhone());
        dto.setDateOfBirth(patient.getDateOfBirth());
        return dto;
    }
}
