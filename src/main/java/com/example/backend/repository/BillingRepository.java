package com.example.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.backend.entity.Billing;

public interface BillingRepository extends JpaRepository<Billing, Long> {
}
