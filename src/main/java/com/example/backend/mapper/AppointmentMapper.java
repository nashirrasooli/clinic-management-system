package com.example.backend.mapper;

import com.example.backend.dto.AppointmentDto;
import com.example.backend.entity.Appointment;

public class AppointmentMapper {

    public static AppointmentDto toDto(Appointment appointment) {
        AppointmentDto dto = new AppointmentDto();
        dto.setId(appointment.getId());
        dto.setPatientId(appointment.getPatient().getId());
        dto.setDoctorId(appointment.getDoctor().getId());
        dto.setAppointmentTime(appointment.getAppointmentTime());
        dto.setStatus(appointment.getStatus());
        return dto;
    }
}
