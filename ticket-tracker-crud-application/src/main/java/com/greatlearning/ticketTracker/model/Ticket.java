package com.greatlearning.ticketTracker.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tickets")
@Data
@NoArgsConstructor
public class Ticket {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "tickettitle")
	private String tickettitle;

	@Column(name = "ticketdescription")
	private String ticketdescription;

	@Column(name = "ticketcreatedon")
	private String ticketcreatedon;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTickettitle() {
		return tickettitle;
	}

	public void setTickettitle(String tickettitle) {
		this.tickettitle = tickettitle;
	}

	public String getTicketdescription() {
		return ticketdescription;
	}

	public void setTicketdescription(String ticketdescription) {
		this.ticketdescription = ticketdescription;
	}

	public String getTicketcreatedon() {
		return ticketcreatedon;
	}

	public void setTicketcreatedon(String ticketcreatedon) {
		this.ticketcreatedon = ticketcreatedon;
	}
	
	

}
