package com.boulekhras_diouri.gestionTickets.services;

import java.util.List;

import com.boulekhras_diouri.gestionTickets.models.Client;
import com.boulekhras_diouri.gestionTickets.models.Ticket;
import com.boulekhras_diouri.gestionTickets.repositories.ClientRepository;
import com.boulekhras_diouri.gestionTickets.repositories.TicketRepository;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



@Service
@Transactional
public class ClientServiceImpl implements ClientService {
    private TicketRepository ticketRepository;
    private ClientRepository clientRepository;
	  public ClientServiceImpl(TicketRepository ticketRepository,ClientRepository clientRepository) {
	        this.ticketRepository = ticketRepository;
	        this.clientRepository = clientRepository;
	    }

	

	@Override
	public List<Ticket> findAll_byIdCLIENT(long id) {
		// TODO Auto-generated method stub
		return (List<Ticket>) clientRepository.findAllTicketClient(id);
	}

	@Override
	public Client getById(Long id) {
	
		return clientRepository.getById(id);
	}

	@Override
	public Ticket addTicket(Ticket ticket) {
		// TODO Auto-generated method stub
		return ticketRepository.save(ticket);
	}

	@Override
	public Ticket updateTicket(Ticket ticket) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void supprimerTicket(Long id) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public Client AddClient(Client client) {
		// TODO Auto-generated method stub
		return clientRepository.save(client);
	}



	@Override
	public List<Client> findAll() {
		// TODO Auto-generated method stub
		return clientRepository.findAll();
	}



	@Override
	public long findIdByUsername(String nom) {
		// TODO Auto-generated method stub
		return clientRepository.findIdClientByNom(nom);
	}

}
