package com.barbershop.challenge.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.barbershop.challenge.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}