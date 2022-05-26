package com.boulekhras_diouri.gestionTickets;

import com.boulekhras_diouri.gestionTickets.security.services.SecurityService;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class GestionsTicketsApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionsTicketsApplication.class, args);
	}
	 @Bean
	    PasswordEncoder passwordEncoder(){
	        return new BCryptPasswordEncoder();
	    }

	   // @Bean
	    CommandLineRunner saveUsers(SecurityService securityService){
	        return args -> {
	           securityService.saveNewUser("fadwa", "123", "123");
	            securityService.saveNewUser("dev", "123", "123");
	            securityService.saveNewUser("client", "123", "123");
	            securityService.saveNewUser("fedwa", "123", "123");
	           
			//	securityService.saveNewRole("ADMIN", "Admin");
	          //  securityService.saveNewRole("DEVELOPPEUR", "Developpeur");
	        //securityService.saveNewRole("CLIENT", "client");
	            
	            securityService.addRoleToUser("fadwa", "ADMIN");
	            securityService.addRoleToUser("dev", "DEVELOPPEUR");
	            securityService.addRoleToUser("client", "CLIENT");
	            securityService.addRoleToUser("fedwa", "CLIENT");
	            
	            
	        	
	        	securityService.saveNewUser("abdelhamid", "123", "123");
	        	securityService.saveNewUser("hamid", "123", "123");
	        	  securityService.addRoleToUser("abdelhamid", "DEVELOPPEUR");
	        	  securityService.addRoleToUser("hamid", "DEVELOPPEUR");
	        };
	    }

}
