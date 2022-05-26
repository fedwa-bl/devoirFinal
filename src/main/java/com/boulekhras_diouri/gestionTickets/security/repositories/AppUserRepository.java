package com.boulekhras_diouri.gestionTickets.security.repositories;

import com.boulekhras_diouri.gestionTickets.security.entities.AppUser;

import org.springframework.data.jpa.repository.JpaRepository;


public interface AppUserRepository extends JpaRepository<AppUser, String> {
    AppUser findByUsername(String username);
}
