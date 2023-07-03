package com.greatlearning.ticketTracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.greatlearning.ticketTracker.model.Ticket;

@Repository
public interface TicketJpaRepository extends JpaRepository<Ticket, Integer> {

}
