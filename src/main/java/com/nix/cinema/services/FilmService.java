package com.nix.cinema.services;

import com.nix.cinema.model.Film;
import org.springframework.data.domain.Page;

import java.util.List;

public interface FilmService {

    List<Film> getAllFilms();

    Film getFilmByID(Long id);

    Page<Film> getAllFilmsPage(Integer pageNumber);

    Page<Film> searchByTittle(String filmTittle, Integer pageNumber);

    List<Film> getLast();

    void addFilm(Film film);

    void deleteFilmByID(Long id);
}
