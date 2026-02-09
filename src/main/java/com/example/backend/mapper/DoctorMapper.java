package com.example.backend.mapper;

import com.example.backend.dto.DoctorDto;
import com.example.backend.entity.Doctor;

public class DoctorMapper {

    public static Doctor toEntity(DoctorDto dto) {
        Doctor doctor = new Doctor();
        doctor.setId(dto.getId());
        doctor.setFullName(dto.getFullName());
        doctor.setSpecialization(dto.getSpecialization());
        return doctor;
    }

    public static DoctorDto toDto(Doctor doctor) {
        DoctorDto dto = new DoctorDto();
        dto.setId(doctor.getId());
        dto.setFullName(doctor.getFullName());
        dto.setSpecialization(doctor.getSpecialization());
        return dto;
    }
}
