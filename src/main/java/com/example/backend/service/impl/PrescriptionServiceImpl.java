package com.example.backend.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.backend.dto.PrescriptionDto;
import com.example.backend.entity.Appointment;
import com.example.backend.entity.Prescription;
import com.example.backend.mapper.PrescriptionMapper;
import com.example.backend.repository.AppointmentRepository;
import com.example.backend.repository.PrescriptionRepository;
import com.example.backend.service.PrescriptionService;

@Service
public class PrescriptionServiceImpl implements PrescriptionService {

    private final PrescriptionRepository prescriptionRepository;
    private final AppointmentRepository appointmentRepository;

    public PrescriptionServiceImpl(
            PrescriptionRepository prescriptionRepository,
            AppointmentRepository appointmentRepository) {
        this.prescriptionRepository = prescriptionRepository;
        this.appointmentRepository = appointmentRepository;
    }

    @Override
    public PrescriptionDto create(PrescriptionDto dto) {

        Appointment appointment = appointmentRepository.findById(dto.getAppointmentId())
                .orElseThrow(() -> new RuntimeException("Appointment not found"));

        Prescription prescription = new Prescription();
        prescription.setAppointment(appointment);
        prescription.setMedication(dto.getMedication());
        prescription.setDosage(dto.getDosage());
        prescription.setInstructions(dto.getInstructions());

        return PrescriptionMapper.toDto(
                prescriptionRepository.save(prescription));
    }
}
