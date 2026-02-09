package com.example.backend.service;

import com.example.backend.entity.Billing;

public interface BillingService {

    Billing createBillForAppointment(Long appointmentId);

    Billing getBillByAppointment(Long appointmentId);

    Billing markBillAsPaid(Long billingId);
}
