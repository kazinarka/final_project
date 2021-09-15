package com.nix.cinema.services.impl;

import com.nix.cinema.model.Hall;
import com.nix.cinema.model.Ticket;
import com.nix.cinema.repository.TicketRepository;
import com.nix.cinema.repository.UserRepository;
import com.nix.cinema.services.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketServiceImpl implements TicketService {

    @Value("${page.size}")
    private Integer pageSize;

    private final TicketRepository ticketRepository;
    private final UserRepository userRepository;

    @Autowired
    public TicketServiceImpl(TicketRepository ticketRepository, UserRepository userRepository) {
        this.ticketRepository = ticketRepository;
        this.userRepository = userRepository;
    }

    public Page<Ticket> findAll(Integer pageNumber) {
        return ticketRepository.findAll(PageRequest.of(pageNumber - 1, pageSize));
    }

    public List<Ticket> getAllTicketByUser(Long userId) {
        return ticketRepository.findByUser(userRepository.findById(userId));
    }

    public List<Ticket> getAllTicket() {
        return ticketRepository.findAll();
    }

    public Ticket findById(Long id) {
        return ticketRepository.findById(id).orElse(new Ticket());
    }

    public void update(Ticket ticket) {
        ticketRepository.save(ticket);
    }

}
