package com.greatlearning.ticketTracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.greatlearning.ticketTracker.model")
public class TicketTrackerCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(TicketTrackerCrudApplication.class, args);
	}

}
