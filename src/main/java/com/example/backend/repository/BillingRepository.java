package com.example.backend.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.backend.entity.Billing;

public interface BillingRepository extends JpaRepository<Billing, Long> {
    Optional<Billing> findByAppointmentId(Long appointmentId);
}
