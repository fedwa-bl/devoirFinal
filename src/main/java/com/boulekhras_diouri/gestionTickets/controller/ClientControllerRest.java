package com.boulekhras_diouri.gestionTickets.controller;

import java.util.List;

import com.boulekhras_diouri.gestionTickets.models.Client;
import com.boulekhras_diouri.gestionTickets.models.Ticket;
import com.boulekhras_diouri.gestionTickets.services.ClientService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clients")
public class ClientControllerRest {
	  private ClientService clientService;

	    public ClientControllerRest(ClientService clientService) {
	        this.clientService = clientService;
	    }

	    
	    @PostMapping("/addticket")
	    public void ajouter(@RequestBody Ticket t) {
	    	clientService.addTicket(t);
	    	
	    	
	    }
	    @PostMapping("/addclient")
	    public void ajouter(@RequestBody Client c) {
	    	clientService.AddClient(c);
	    	
	    	
	    }
	    @GetMapping
	    public List<Client> get(){
	    	return clientService.findAll();
	    }
	    @GetMapping("/getTicket/{id}")
	    public List<Ticket> getTicket(@PathVariable long id){
	    	return clientService.findAll_byIdCLIENT(id);
	    }
	    /*
	    @GetMapping
	    public List<Ticket> get(){
	    	return utilisateurRepository.findAll();
	    }
	    */
	    
}
