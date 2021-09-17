package com.nix.cinema;

import com.nix.cinema.model.User;
import com.nix.cinema.repository.TicketRepository;
import com.nix.cinema.repository.UserRepository;
import com.nix.cinema.services.UserService;
import com.nix.cinema.services.impl.UserServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class UserServiceTest {

    UserService userService;
    UserRepository userRepository;
    TicketRepository ticketRepository;
    BCryptPasswordEncoder bCryptPasswordEncoder;

    @BeforeEach
    void setUp() {
        userRepository = mock(UserRepository.class);
        ticketRepository = mock(TicketRepository.class);
        bCryptPasswordEncoder = mock(BCryptPasswordEncoder.class);
        userService = new UserServiceImpl(userRepository, ticketRepository, bCryptPasswordEncoder);
    }

    @Test
    void updateTest() {

    }

    @Test
    void addTest() {

    }

    @Test
    void deleteTest() {

    }

    @Test
    void getAllUsersTest() {
        List<User> users = userService.findAll();
        assertEquals(0, users.size());
        verify(userRepository).findAll();
        verifyNoInteractions(userRepository);
    }

    @Test
    void getUserByIdTest() {

    }

    @Test
    void getUserByPhone() {

    }

    @Test
    void getUserByEmail() {

    }

    @Test
    void getUserByUsername() {

    }
}
