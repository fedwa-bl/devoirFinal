package com.boulekhras_diouri.gestionTickets.controller;

import java.util.List;

import com.boulekhras_diouri.gestionTickets.models.Ticket;
import com.boulekhras_diouri.gestionTickets.services.DeveloppeurService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/developpeurs")
public class DeveloppeurControllerRest {
	  private DeveloppeurService developpeurService;

	    public DeveloppeurControllerRest(DeveloppeurService developpeurService) {
	        this.developpeurService = developpeurService;
	    }
	    
	    @PutMapping("/updateStatus")
	    public void affecterTicket(@RequestBody Ticket t ) {
	    	developpeurService.updateStatus(t.getStatus(),t.getId_ticket());
	    	
	    	
	    }
	 

	    @GetMapping("/getTicket/{id}")
	    public List<Ticket> getTicket(@PathVariable long id){
	    	return developpeurService.findAll_byIdDev(id);
	    }
}
