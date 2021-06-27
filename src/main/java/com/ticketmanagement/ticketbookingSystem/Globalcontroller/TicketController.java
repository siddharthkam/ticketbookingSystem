package com.ticketmanagement.ticketbookingSystem.Globalcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ticketmanagement.ticketbookingSystem.model.Ticket;
import com.ticketmanagement.ticketbookingSystem.serviceLayer.TicketServiceImpl;

@RestController
public class TicketController {
	
	@Autowired
	TicketServiceImpl TicketServiceImpl; 
	
	
	@PostMapping("/user/ticket/")
	public ResponseEntity<Ticket> addticket(@RequestBody Ticket ticket)
	{
		Ticket ticket1=TicketServiceImpl.addTicket(ticket);
		return new ResponseEntity<Ticket>(ticket1, null,HttpStatus.OK);
		
	}
	
	@GetMapping("/user/ticket/{id}")
	public ResponseEntity<Ticket> getticket(@PathVariable("id") int id)
	{
		
		Ticket ticket1=TicketServiceImpl.getTicket(id);
		return new ResponseEntity<Ticket>(ticket1, null,HttpStatus.OK);
		
	}
	
	@GetMapping("/user/allticket")
	public ResponseEntity<List<Ticket>> getallticket()
	{
		List<Ticket> ticket1=TicketServiceImpl.getAllTicket();
		return new ResponseEntity<>(ticket1, null,HttpStatus.OK);	
	}

}
