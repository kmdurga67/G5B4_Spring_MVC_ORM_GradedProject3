package com.greatlearning.ticketTracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.greatlearning.ticketTracker.model.Ticket;
import com.greatlearning.ticketTracker.service.TicketService;

@Controller
@RequestMapping("/tickets")
public class TicketController {

	@Autowired
	private TicketService ticketService;

	public TicketController(TicketService ticketService) {
		this.ticketService = ticketService;
	}

	@GetMapping("/list")
	public String listBooks(Model model) {
		List<Ticket> tickets = this.ticketService.findAll();
		model.addAttribute("tickets", tickets);
		return "tickets/list-tickets";
	}

	@PostMapping("/save")
	public String saveBook(@ModelAttribute("ticket") Ticket ticket) {
		this.ticketService.save(ticket);
		return "redirect:/tickets/list";
	}

	@GetMapping("/add")
	public String showFormForAdd(Model model) {
		// create model attribute to bind form data
		Ticket ticket = new Ticket();

		model.addAttribute("ticket", ticket);

		return "tickets/ticket-form";
	}

	@PostMapping("/delete")
	public String deleteBook(@RequestParam("id") int id) {
		this.ticketService.deleteTicketById(id);
		return "redirect:/tickets/list";
	}

	@PostMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("id") int id, Model model) {

		// get the book from the service
		Ticket theTicket = ticketService.findTicketById(id);

		// set book as a model attribute to pre-populate the form
		model.addAttribute("ticket", theTicket);

		return "tickets/ticket-form";
	}

}
