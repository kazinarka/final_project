package com.nix.cinema.services.impl;

import com.nix.cinema.model.Genre;
import com.nix.cinema.repository.GenreRepository;
import com.nix.cinema.services.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GenreServiceImpl implements GenreService {

    private final GenreRepository genreRepository;

    @Autowired
    public GenreServiceImpl(GenreRepository genreRepository) {
        this.genreRepository = genreRepository;
    }

    public List<Genre> getAllGenre() {
        return genreRepository.findAll();
    }

    public Genre getGenreByID(Long id) {
        return genreRepository.findById(id).orElse(new Genre());
    }

    public void deleteGenreById(Long id) {
        if (getGenreByID(id) != null)
            genreRepository.deleteById(id);
    }

    public void addGenre(Genre genre) {
        genreRepository.saveAndFlush(genre);
    }
}
