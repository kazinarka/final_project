package com.nix.cinema.services;

import com.nix.cinema.model.Ticket;
import org.springframework.data.domain.Page;

public interface TicketService {

    Page<Ticket> findAll(Integer pageNumber);

    Ticket findById(Long id);

    void update(Ticket ticket);
}
