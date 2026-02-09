package com.example.backend.mapper;

import com.example.backend.dto.PrescriptionDto;
import com.example.backend.entity.Prescription;

public class PrescriptionMapper {

    public static PrescriptionDto toDto(Prescription prescription) {
        PrescriptionDto dto = new PrescriptionDto();
        dto.setId(prescription.getId());
        dto.setAppointmentId(prescription.getAppointment().getId());
        dto.setMedication(prescription.getMedication());
        dto.setDosage(prescription.getDosage());
        dto.setInstructions(prescription.getInstructions());
        return dto;
    }
}
