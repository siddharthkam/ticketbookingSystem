package com.ticketmanagement.ticketbookingSystem.serviceLayer;

import java.util.List;

import com.ticketmanagement.ticketbookingSystem.model.Ticket;


public interface TicketService {
	
	public Ticket addTicket(Ticket t);
	public Ticket getTicket(int id);
	public List<Ticket> getAllTicket();
	public Ticket modifyTicket(Ticket t);
	public List<Ticket> getAllTicketbyDestination(String destination);
	List<Ticket> getAllTicketbyfair(double fare);

}
