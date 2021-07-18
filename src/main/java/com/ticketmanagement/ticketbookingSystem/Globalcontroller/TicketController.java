package com.ticketmanagement.ticketbookingSystem.Globalcontroller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ticketmanagement.ticketbookingSystem.model.Ticket;
import com.ticketmanagement.ticketbookingSystem.serviceLayer.TicketServiceImpl;

@RestController
public class TicketController {

	@Autowired
	TicketServiceImpl TicketServiceImpl;

	@PostMapping("/user/ticket")
	public ResponseEntity<Ticket> addticket(@RequestBody Ticket ticket) {
		Ticket ticket1 = TicketServiceImpl.addTicket(ticket);
		return new ResponseEntity<Ticket>(ticket1, null, HttpStatus.OK);

	}

	@GetMapping("/user/ticketbyid/{id}")
	public ResponseEntity<Ticket> getticket(@PathVariable("id") int id) {

		Ticket ticket1 = TicketServiceImpl.getTicket(id);
		return new ResponseEntity<Ticket>(ticket1, null, HttpStatus.OK);

	}

	@GetMapping("/user/ticketbydestination/{destination}")
	public ResponseEntity<List<Ticket>> getticket(@PathVariable("destination") String destination) {

		List<Ticket> tickets = TicketServiceImpl.getAllTicketbyDestination(destination);

		//List<Ticket> tickets2 = tickets.stream().filter(tickets1 -> tickets1.getDestination().equals("PUNE"))
			//	.collect(Collectors.toList());

		return new ResponseEntity<List<Ticket>>(tickets, null, HttpStatus.OK);
	}

	@GetMapping("/user/ticketbyfare/{fare}")
	public ResponseEntity<List<Ticket>> getticket(@PathVariable("fare") float fare) {

		List<Ticket> tickets = TicketServiceImpl.getAllTicketbyfair(fare);
		return new ResponseEntity<List<Ticket>>(tickets, null, HttpStatus.OK);
	}

	@GetMapping("/user/allticket")
	public ResponseEntity<List<Ticket>> getallticket() {
		List<Ticket> ticket1 = TicketServiceImpl.getAllTicket();
		
		List<Ticket> tickets2 = ticket1.stream().filter(tickets3 -> tickets3.getDestination().equals("PUNE"))
			.collect(Collectors.toList());
		
		return new ResponseEntity<>(tickets2, null, HttpStatus.OK);
	}

	@PutMapping("/user/modifybook")
	public ResponseEntity<Ticket> modifyticket(@RequestBody Ticket ticket) {
		Ticket ticket1 = TicketServiceImpl.modifyTicket(ticket);
		return new ResponseEntity<Ticket>(ticket1, null, HttpStatus.OK);
	}

	@GetMapping("/user/destinationquery/{destination}")
	public ResponseEntity<List<Ticket>> findByTicketbydestinationquery(
			@PathVariable("destination") String destination) {
		List<Ticket> tickes = TicketServiceImpl.findByTicketbydestinationquery(destination);
		return new ResponseEntity<List<Ticket>>(tickes, null, HttpStatus.OK);
	}

}
