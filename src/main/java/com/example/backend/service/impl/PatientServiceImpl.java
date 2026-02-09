package com.example.backend.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.backend.entity.Patient;
import com.example.backend.repository.PatientRepository;
import com.example.backend.service.PatientService;

@Service
public class PatientServiceImpl implements PatientService {

    private final PatientRepository patientRepository;

    public PatientServiceImpl(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    @Override
    public Patient createPatient(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public Patient getPatientById(Long id) {
        return patientRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Patient not found"));
    }

    @Override
    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

    @Override
    public Patient updatePatient(Long id, Patient patient) {
        Patient existing = getPatientById(id);
        existing.setFullName(patient.getFullName());
        existing.setPhone(patient.getPhone());
        existing.setDateOfBirth(patient.getDateOfBirth());
        return patientRepository.save(existing);
    }

    @Override
    public void deletePatient(Long id) {
        patientRepository.deleteById(id);
    }
}
