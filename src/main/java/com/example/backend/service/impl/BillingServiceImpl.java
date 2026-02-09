package com.example.backend.service.impl;

import org.springframework.stereotype.Service;

import com.example.backend.entity.Appointment;
import com.example.backend.entity.Billing;
import com.example.backend.repository.AppointmentRepository;
import com.example.backend.repository.BillingRepository;
import com.example.backend.service.BillingService;

@Service
public class BillingServiceImpl implements BillingService {

    private final BillingRepository billingRepository;
    private final AppointmentRepository appointmentRepository;

    public BillingServiceImpl(BillingRepository billingRepository,
            AppointmentRepository appointmentRepository) {
        this.billingRepository = billingRepository;
        this.appointmentRepository = appointmentRepository;
    }

    @Override
    public Billing createBillForAppointment(Long appointmentId) {
        Appointment appointment = appointmentRepository.findById(appointmentId)
                .orElseThrow(() -> new RuntimeException("Appointment not found"));

        Billing billing = new Billing();
        billing.setAppointment(appointment);
        billing.setAmount(500.0); // example
        billing.setPaid(false);

        return billingRepository.save(billing);
    }

    // @Override
    // public Billing getBillByAppointment(Long appointmentId) {
    // return billingRepository.findByAppointmentId(appointmentId);
    // }
    @Override
    public Billing getBillByAppointment(Long appointmentId) {
        return billingRepository.findByAppointmentId(appointmentId)
                .orElseThrow(() -> new RuntimeException("Billing not found"));
    }

    @Override
    public Billing markBillAsPaid(Long billingId) {
        Billing billing = billingRepository.findById(billingId)
                .orElseThrow(() -> new RuntimeException("Bill not found"));

        billing.setPaid(true);
        return billingRepository.save(billing);
    }
}
