package com.barbershop.challenge.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.barbershop.challenge.model.Appointment;
import com.barbershop.challenge.model.User;
import com.barbershop.challenge.repository.AppointmentRepository;
import com.barbershop.challenge.repository.UserRepository;

@Service
public class AppointmentService {

    @Autowired
    private AppointmentRepository appointmentRepository;

    @Autowired
    private UserRepository userRepository;

    public List<Appointment> getAllAppointments() {
        return appointmentRepository.findAll();
    }

    public Appointment saveAppointment(Appointment appointment) {
        // Verifica se a entidade User está corretamente associada
        Long userId = appointment.getUser().getId();
        if (userId == null) {
            throw new IllegalArgumentException("User ID cannot be null");
        }

        // Busca o usuário completo antes de salvar o agendamento
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found"));

        appointment.setUser(user);

        return appointmentRepository.save(appointment);
    }
}