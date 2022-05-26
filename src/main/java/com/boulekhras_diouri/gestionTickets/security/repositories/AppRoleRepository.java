package com.boulekhras_diouri.gestionTickets.security.repositories;

import com.boulekhras_diouri.gestionTickets.security.entities.AppRole;

import org.springframework.data.jpa.repository.JpaRepository;



public interface AppRoleRepository extends JpaRepository<AppRole, Long> {
    AppRole findByRoleName(String roleName);
}
