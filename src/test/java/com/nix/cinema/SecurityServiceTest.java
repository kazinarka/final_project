package com.nix.cinema;

import com.nix.cinema.repository.UserRepository;
import com.nix.cinema.services.SecurityService;
import com.nix.cinema.services.impl.SecurityServiceImpl;
import com.nix.cinema.services.impl.UserDetailsServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.userdetails.UserDetailsService;

import static org.mockito.Mockito.mock;

public class SecurityServiceTest {

    SecurityService securityService;
    UserDetailsService userDetailsService;
    AuthenticationManager authenticationManager;
    UserRepository userRepository;

    @BeforeEach
    void setUp() {
        authenticationManager = mock(AuthenticationManager.class);
        userRepository = mock(UserRepository.class);
        userDetailsService = new UserDetailsServiceImpl(userRepository);
        securityService = new SecurityServiceImpl(authenticationManager, userDetailsService);
    }

    @Test
    void autoLogin() {

    }
}
