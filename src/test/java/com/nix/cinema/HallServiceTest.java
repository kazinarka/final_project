package com.nix.cinema;

import com.nix.cinema.model.Hall;
import com.nix.cinema.repository.CinemaRepository;
import com.nix.cinema.repository.HallRepository;
import com.nix.cinema.services.HallService;
import com.nix.cinema.services.impl.HallServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class HallServiceTest {

    HallService hallService;
    HallRepository hallRepository;
    CinemaRepository cinemaRepository;

    @BeforeEach
    void setUp() {
        hallRepository = mock(HallRepository.class);
        cinemaRepository = mock(CinemaRepository.class);
        hallService = new HallServiceImpl(hallRepository, cinemaRepository);
    }

    @Test
    void addHallTest() {

    }

    @Test
    void getAllHallTest() {
        List<Hall> halls = hallService.getAllHall();
        assertEquals(0, halls.size());
        verify(hallRepository).findAll();
        verifyNoInteractions(hallRepository);
    }

    @Test
    void getAllHallByCinemaTest() {

    }

    @Test
    void getHallByIdTest() {

    }

    @Test
    void deleteHallById() {

    }
}
