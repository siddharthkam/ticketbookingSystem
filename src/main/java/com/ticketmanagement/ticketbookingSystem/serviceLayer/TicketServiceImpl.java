package com.ticketmanagement.ticketbookingSystem.serviceLayer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ticketmanagement.ticketbookingSystem.model.Ticket;
import com.ticketmanagement.ticketbookingSystem.repositoryLayer.TicketRepository;

@Service
public class TicketServiceImpl implements TicketService {

	@Autowired
	TicketRepository ticketrepository;

	@Override
	public Ticket addTicket(Ticket ticket) {

		return ticketrepository.save(ticket);

	}

	@Override
	public Ticket getTicket(int id) {
		if (ticketrepository.findById(id).isPresent())
			return ticketrepository.findById(id).get();
		else
			return null;

	}

	@Override
	public List<Ticket> getAllTicket() {
		return (List<Ticket>) ticketrepository.findAll();
	}

	@Override
	public Ticket modifyTicket(Ticket ticket) {

		return ticketrepository.save(ticket);

	}

}
