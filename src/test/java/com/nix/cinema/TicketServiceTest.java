package com.nix.cinema;

import com.nix.cinema.model.Ticket;
import com.nix.cinema.repository.TicketRepository;
import com.nix.cinema.repository.UserRepository;
import com.nix.cinema.services.TicketService;
import com.nix.cinema.services.impl.TicketServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class TicketServiceTest {

    TicketService ticketService;
    TicketRepository ticketRepository;
    UserRepository userRepository;

    @BeforeEach
    void setUp() {
        ticketRepository = mock(TicketRepository.class);
        userRepository = mock(UserRepository.class);
        ticketService = new TicketServiceImpl(ticketRepository, userRepository);
    }

    @Test
    void updateTest() {

    }

    @Test
    void getAllTicketsTest() {
        List<Ticket> tickets = ticketService.getAllTicket();
        assertEquals(0, tickets.size());
        verify(ticketRepository).findAll();
        verifyNoInteractions(ticketRepository);
    }

    @Test
    void getAllTicketsPageTest() {

    }

    @Test
    void getTicketByIdTest() {

    }

    @Test
    void getAllTicketsByUser() {

    }
}
