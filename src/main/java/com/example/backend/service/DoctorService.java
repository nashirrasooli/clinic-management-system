package com.example.backend.service;

import java.util.List;

import com.example.backend.entity.Doctor;

public interface DoctorService {

    Doctor createDoctor(Doctor doctor);

    Doctor getDoctorById(Long id);

    List<Doctor> getAllDoctors();

    Doctor updateDoctor(Long id, Doctor doctor);

    void deleteDoctor(Long id);
}
