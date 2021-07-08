package com.ticketmanagement.ticketbookingSystem.repositoryLayer;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ticketmanagement.ticketbookingSystem.model.Ticket;


@Repository
public interface TicketRepository extends CrudRepository<Ticket, java.lang.Integer> {
	public List<Ticket> findByDestination(String destination);
	public List<Ticket> findByTicketfareLessThan(double fare);
	@Query("select T from Ticket T where T.destination=:d")
	public List<Ticket> findByTicketbydestinationquery(@Param("d") String destination);
}
