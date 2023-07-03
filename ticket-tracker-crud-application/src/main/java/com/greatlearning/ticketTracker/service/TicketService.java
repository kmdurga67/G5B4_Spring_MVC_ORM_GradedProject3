package com.greatlearning.ticketTracker.service;

import java.util.List;

import com.greatlearning.ticketTracker.model.Ticket;

public interface TicketService {

	Ticket save(Ticket ticket);

	List<Ticket> findAll();

	Ticket findTicketById(int id);

	void deleteTicketById(int id);

}
