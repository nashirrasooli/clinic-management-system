package com.example.backend.service;

import java.util.List;

import com.example.backend.entity.Prescription;

public interface PrescriptionService {

    Prescription createPrescription(Prescription prescription);

    Prescription getPrescriptionById(Long id);

    List<Prescription> getAllPrescriptions();

    Prescription updatePrescription(Long id, Prescription prescription);

    void deletePrescription(Long id);
}
