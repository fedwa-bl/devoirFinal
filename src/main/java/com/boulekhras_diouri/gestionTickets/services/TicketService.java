package com.boulekhras_diouri.gestionTickets.services;

import java.util.List;

import com.boulekhras_diouri.gestionTickets.models.Ticket;




public interface TicketService {
	   List<Ticket> findAll();

	   Ticket getById(Long id);

	   Ticket ajouterTicket(Ticket ticket);

	   Ticket updateTicket(Ticket ticket);

	    void supprimerTicket(Long id);
}
