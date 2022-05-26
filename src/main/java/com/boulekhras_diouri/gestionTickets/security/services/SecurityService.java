package com.boulekhras_diouri.gestionTickets.security.services;

import com.boulekhras_diouri.gestionTickets.security.entities.AppRole;
import com.boulekhras_diouri.gestionTickets.security.entities.AppUser;

public interface SecurityService {

    AppUser saveNewUser(String username, String password, String rePassword);

    AppRole saveNewRole(String roleName, String description);

    void addRoleToUser(String username, String roleName);

    void deleteRoleFromUser(String username, String roleName);

    AppUser loadUserByUsername(String username);

}
