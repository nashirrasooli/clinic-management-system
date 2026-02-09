package com.example.backend.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.backend.dto.PatientDto;
import com.example.backend.entity.Patient;
import com.example.backend.mapper.PatientMapper;
import com.example.backend.repository.PatientRepository;
import com.example.backend.service.PatientService;

@Service
public class PatientServiceImpl implements PatientService {

    private final PatientRepository patientRepository;

    public PatientServiceImpl(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    @Override
    public PatientDto create(PatientDto dto) {
        Patient patient = PatientMapper.toEntity(dto);
        return PatientMapper.toDto(patientRepository.save(patient));
    }

    @Override
    public PatientDto getById(Long id) {
        Patient patient = patientRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Patient not found"));
        return PatientMapper.toDto(patient);
    }

    @Override
    public List<PatientDto> getAll() {
        return patientRepository.findAll()
                .stream()
                .map(PatientMapper::toDto)
                .toList();
    }

    @Override
    public PatientDto update(Long id, PatientDto dto) {
        Patient existing = patientRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Patient not found"));

        existing.setFullName(dto.getFullName());
        existing.setPhone(dto.getPhone());
        existing.setDateOfBirth(dto.getDateOfBirth());

        return PatientMapper.toDto(patientRepository.save(existing));
    }

    @Override
    public void delete(Long id) {
        patientRepository.deleteById(id);
    }
}
