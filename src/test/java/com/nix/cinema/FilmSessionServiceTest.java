package com.nix.cinema;

import com.nix.cinema.model.FilmSession;
import com.nix.cinema.repository.CinemaRepository;
import com.nix.cinema.repository.FilmRepository;
import com.nix.cinema.repository.FilmSessionRepository;
import com.nix.cinema.repository.HallRepository;
import com.nix.cinema.services.FilmSessionService;
import com.nix.cinema.services.impl.FilmSessionServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class FilmSessionServiceTest {

    FilmSessionService filmSessionService;
    FilmSessionRepository filmSessionRepository;
    CinemaRepository cinemaRepository;
    FilmRepository filmRepository;
    HallRepository hallRepository;

    @BeforeEach
    void setUp() {
        filmSessionRepository = mock(FilmSessionRepository.class);
        cinemaRepository = mock(CinemaRepository.class);
        filmRepository = mock(FilmRepository.class);
        hallRepository = mock(HallRepository.class);
        filmSessionService = new FilmSessionServiceImpl(filmSessionRepository, filmRepository, hallRepository, cinemaRepository);
    }

    @Test
    void addSessionTest() {

    }

    @Test
    void getAllSessionTest() {
        List<FilmSession> filmSessions = filmSessionService.getAllSession();
        assertEquals(0, filmSessions.size());
        verify(filmSessionRepository).findAll();
        verifyNoInteractions(filmSessionRepository);
    }

    @Test
    void getAllSessionByFilmTest() {

    }

    @Test
    void getAllSessionByHallTest() {

    }

    @Test
    void getSessionByIdTest() {

    }

    @Test
    void deleteSessionById() {

    }
}
