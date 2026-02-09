package com.example.backend.service;

import java.util.List;

import com.example.backend.dto.PatientDto;

public interface PatientService {

    PatientDto create(PatientDto dto);

    PatientDto getById(Long id);

    List<PatientDto> getAll();

    PatientDto update(Long id, PatientDto dto);

    void delete(Long id);
}
