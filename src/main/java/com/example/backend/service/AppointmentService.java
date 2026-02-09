package com.example.backend.service;

import java.util.List;

import com.example.backend.dto.AppointmentDto;

public interface AppointmentService {

    AppointmentDto create(AppointmentDto dto);

    List<AppointmentDto> getAll();
}
