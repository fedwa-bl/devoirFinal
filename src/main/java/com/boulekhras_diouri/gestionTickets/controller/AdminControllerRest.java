package com.boulekhras_diouri.gestionTickets.controller;

import java.util.List;

import com.boulekhras_diouri.gestionTickets.models.Ticket;
import com.boulekhras_diouri.gestionTickets.repositories.TicketRepository;
import com.boulekhras_diouri.gestionTickets.services.AdminService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/admins")
public class AdminControllerRest {
	 private AdminService adminService;
	 @Autowired
	 TicketRepository ticketRepository;
	    public AdminControllerRest(AdminService adminService) {
	        this.adminService = adminService;
	    }
	    
	    @GetMapping("/bugs")
	    public List<Ticket> get(){
	    	return adminService.findAllTicketNonAttribuer();
	    }
	    
	   
	    @PutMapping("/modifier")
	    public void modifier(@RequestBody Ticket newTicket) {
	    	
	    	ticketRepository.save(newTicket);
	    }
	    
	    @PutMapping("/affecterTicket")
	    public void affecterTicket(@RequestBody Ticket t ) {
	    	adminService.AttribuerTicket(t.getDeveloppeur().getId(),t.getAdmin().getId(),t.getId_ticket());
	    	
	    	
	    }
}
