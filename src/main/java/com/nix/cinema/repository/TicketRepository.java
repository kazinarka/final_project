package com.nix.cinema.repository;

import com.nix.cinema.model.Cinema;
import com.nix.cinema.model.Hall;
import com.nix.cinema.model.Ticket;
import com.nix.cinema.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface TicketRepository extends JpaRepository<Ticket, Long> {

    List<Ticket> findByUser(Optional<User> byId);
}
