package com.ticketmanagement.ticketbookingSystem.repositoryLayer;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ticketmanagement.ticketbookingSystem.model.Ticket;

@Repository
public interface TicketRepository extends CrudRepository<Ticket, java.lang.Integer> {

}
