package com.greatlearning.ticketTracker.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.ticketTracker.model.Ticket;
import com.greatlearning.ticketTracker.repository.TicketJpaRepository;

@Service
public class TicketServiceImpl implements TicketService {
	
	private final TicketJpaRepository ticketRepository;
	
	@Autowired
	public TicketServiceImpl(TicketJpaRepository ticketRepository) {
		this.ticketRepository = ticketRepository;
	}

	@Override
	public Ticket save(Ticket ticket) {
		return this.ticketRepository.save(ticket);
	}

	@Override
	public List<Ticket> findAll() {
		return this.ticketRepository.findAll();
	}

	@Override
	public Ticket findTicketById(int id) {
		Optional<Ticket> optionalTicket = this.ticketRepository.findById(id);
		
		if (optionalTicket.isPresent()) {
			return optionalTicket.get();
		}
		
		throw new IllegalArgumentException("Invalid ticket id passed");
	}

	@Override
	public void deleteTicketById(int id) {
		this.ticketRepository.deleteById(id);
	}
}
