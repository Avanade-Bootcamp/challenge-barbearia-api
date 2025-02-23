package com.barbershop.challenge.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.barbershop.challenge.model.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
}