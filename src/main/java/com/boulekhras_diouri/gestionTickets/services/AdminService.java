package com.boulekhras_diouri.gestionTickets.services;

import java.util.Collection;
import java.util.List;

import com.boulekhras_diouri.gestionTickets.models.Ticket;


public interface AdminService {
	  List<Ticket> findAllTicketNonAttribuer();

	   Ticket getById(Long id);

	   Ticket ajouterTicket(Ticket ticket);

	   void AttribuerTicket(long id);

	    void supprimerTicket(Long id);

	    void AttribuerTicket(long id,long id_ad, long id_tic);
	    long findIdAdminByNom(String nom);
	    Collection<Ticket> listeAffectations(long id);
}
