package com.ticketmanagement.ticketbookingSystem.repositoryLayer;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ticketmanagement.ticketbookingSystem.model.Ticket;


@Repository
public interface TicketRepository extends CrudRepository<Ticket, java.lang.Integer> {
	public List<Ticket> findByDestination(String destination);
	public List<Ticket> findByTicketfareLessThan(double fare);
}
