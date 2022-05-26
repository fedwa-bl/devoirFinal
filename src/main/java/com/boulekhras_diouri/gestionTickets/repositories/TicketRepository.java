package com.boulekhras_diouri.gestionTickets.repositories;

import com.boulekhras_diouri.gestionTickets.models.Ticket;

import org.springframework.data.jpa.repository.JpaRepository;




public interface TicketRepository  extends JpaRepository<Ticket, Long> {
	Ticket findById(long id);
}
