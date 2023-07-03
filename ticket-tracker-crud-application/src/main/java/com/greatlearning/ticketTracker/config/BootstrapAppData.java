package com.greatlearning.ticketTracker.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;

import com.greatlearning.ticketTracker.model.Ticket;
import com.greatlearning.ticketTracker.repository.TicketJpaRepository;

@Configuration
public class BootstrapAppData {
	
	@Autowired
	private TicketJpaRepository ticketRepository;
	
	
	@EventListener(ApplicationReadyEvent.class)
	public void onReady(ApplicationReadyEvent event) {
		
		Ticket java = new Ticket();
		java.setTicketcreatedon("30-06-2023");
		java.setTicketdescription("ticket Description");
		java.setTickettitle("From bsb to jhs");
		
		this.ticketRepository.save(java);
		
		
	}

}

