package com.boulekhras_diouri.gestionTickets.services;

import java.util.List;

import com.boulekhras_diouri.gestionTickets.models.Client;
import com.boulekhras_diouri.gestionTickets.models.Ticket;





public interface ClientService {
	   List<Ticket> findAll_byIdCLIENT(long id);
	    List<Client> findAll();
	    
	   Client getById(Long id);
	   
	   Client AddClient(Client c);

	   Ticket addTicket(Ticket ticket);

	   Ticket updateTicket(Ticket ticket);
        long findIdByUsername(String nom);
	    void supprimerTicket(Long id);

}
