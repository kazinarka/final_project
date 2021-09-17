package com.nix.cinema;

import com.nix.cinema.model.Genre;
import com.nix.cinema.repository.GenreRepository;
import com.nix.cinema.services.GenreService;
import com.nix.cinema.services.impl.GenreServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class GenreServiceTest {

    GenreService genreService;
    GenreRepository genreRepository;

    @BeforeEach
    void setUp() {
        genreRepository = mock(GenreRepository.class);
        genreService = new GenreServiceImpl(genreRepository);
    }

    @Test
    void addGenreTest() {

    }

    @Test
    void getAllGenreTest() {
        List<Genre> genres = genreService.getAllGenre();
        assertEquals(0, genres.size());
        verify(genreRepository).findAll();
        verifyNoInteractions(genreRepository);
    }

    @Test
    void getGenreByIdTest() {

    }

    @Test
    void deleteGenreById() {

    }
}
