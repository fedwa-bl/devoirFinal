package com.boulekhras_diouri.gestionTickets.services;

import java.util.List;

import com.boulekhras_diouri.gestionTickets.models.Developpeur;
import com.boulekhras_diouri.gestionTickets.models.Ticket;



public interface DeveloppeurService {

	 void updateStatus (String status, long id_tic);
	List<Ticket> findAll_byIdDev(Long id);
	 Long findIdByUsername(String nom);
	  List<Developpeur> findAll();
}
