package com.nix.cinema.services;

import com.nix.cinema.model.Hall;
import com.nix.cinema.model.Ticket;
import org.springframework.data.domain.Page;

import java.util.List;

public interface TicketService {

    Page<Ticket> findAll(Integer pageNumber);

    Ticket findById(Long id);

    void update(Ticket ticket);

    List<Ticket> getAllTicketByUser(Long userId);

    List<Ticket> getAllTicket();
}
