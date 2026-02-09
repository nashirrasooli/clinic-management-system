package com.example.backend.service;

import java.util.List;

import com.example.backend.dto.PrescriptionDto;

public interface PrescriptionService {

    PrescriptionDto create(PrescriptionDto dto);

    List<PrescriptionDto> getAll();
}
