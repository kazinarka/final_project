package com.nix.cinema.services.impl;

import com.nix.cinema.model.Film;
import com.nix.cinema.repository.FilmRepository;
import com.nix.cinema.services.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmServiceImpl implements FilmService {

    private static final int PAGE_SIZE = 10;

    private final FilmRepository filmRepository;

    @Autowired
    public FilmServiceImpl(FilmRepository filmRepository) {
        this.filmRepository = filmRepository;
    }

    public List<Film> getAllFilms() {
        return filmRepository.findAll();
    }

    public Page<Film> getAllFilmsPage(Integer pageNumber) {
        return filmRepository.findAll(PageRequest.of(pageNumber - 1, PAGE_SIZE, Sort.Direction.ASC, "title"));
    }

    public Film getFilmByID(Long id) {
        return filmRepository.findById(id).orElse(new Film());
    }

    public Page<Film> searchByTittle(String filmTittle, Integer pageNumber) {
        return filmRepository.findByTitleContaining(filmTittle, PageRequest.of(pageNumber - 1, PAGE_SIZE, Sort.Direction.ASC, "title"));
    }

    public List<Film> getLast() {
        return filmRepository.findAll();
    }

    public void addFilm(Film film) {
        filmRepository.saveAndFlush(film);
    }

    public void deleteFilmByID(Long id) {
        if (getFilmByID(id) != null) {
            filmRepository.deleteById(id);
        }
    }
}
