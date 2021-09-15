package com.nix.cinema.services;

import com.nix.cinema.model.Genre;

import java.util.List;

public interface GenreService {

    List<Genre> getAllGenre();

    Genre getGenreByID(Long id);

    void deleteGenreById(Long id);

    void addGenre(Genre genre);
}

