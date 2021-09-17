package com.nix.cinema;

import com.nix.cinema.model.Cinema;
import com.nix.cinema.repository.CinemaRepository;
import com.nix.cinema.services.CinemaService;
import com.nix.cinema.services.impl.CinemaServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class CinemaServiceTest {

    CinemaService cinemaService;
    CinemaRepository cinemaRepository;

    @BeforeEach
    void setUp() {
        cinemaRepository = mock(CinemaRepository.class);
        cinemaService = new CinemaServiceImpl(cinemaRepository);
    }

    @Test
    void addCinemaTest() {

    }

    @Test
    void getAllCinemaTest() {
        List<Cinema> cinemas = cinemaService.getAllCinema();
        assertEquals(0, cinemas.size());
        verify(cinemaRepository).findAll();
        verifyNoInteractions(cinemaRepository);
    }

    @Test
    void getAllCinemaPageTest() {

    }

    @Test
    void getCinemaByIdTest() {

    }

    @Test
    void deleteCinemaById() {

    }
}
