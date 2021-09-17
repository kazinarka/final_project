package com.nix.cinema;

import com.nix.cinema.model.Film;
import com.nix.cinema.repository.FilmRepository;
import com.nix.cinema.services.FilmService;
import com.nix.cinema.services.impl.FilmServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class FilmServiceTest {

    FilmService filmService;
    FilmRepository filmRepository;

    @BeforeEach
    void setUp() {
        filmRepository = mock(FilmRepository.class);
        filmService = new FilmServiceImpl(filmRepository);
    }

    @Test
    void addFilmTest() {

    }

    @Test
    void getAllFilmTest() {
        List<Film> films = filmService.getAllFilms();
        assertEquals(0, films.size());
        verify(filmRepository).findAll();
        verifyNoInteractions(filmRepository);
    }

    @Test
    void getAllFilmPageTest() {

    }

    @Test
    void getFilmByIdTest() {

    }

    @Test
    void deleteFilmById() {

    }

    @Test
    void searchByTitleTest() {

    }

    @Test
    void getLastTest() {

    }
}
