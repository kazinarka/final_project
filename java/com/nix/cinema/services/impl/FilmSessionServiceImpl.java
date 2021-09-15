package com.nix.cinema.services.impl;

import com.nix.cinema.model.FilmSession;
import com.nix.cinema.repository.FilmRepository;
import com.nix.cinema.repository.FilmSessionRepository;
import com.nix.cinema.services.FilmSessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class FilmSessionServiceImpl implements FilmSessionService {

    private final FilmSessionRepository filmSessionRepository;
    private final FilmRepository filmRepository;

    @Autowired
    public FilmSessionServiceImpl(FilmSessionRepository filmSessionRepository, FilmRepository filmRepository) {
        this.filmSessionRepository = filmSessionRepository;
        this.filmRepository = filmRepository;
    }

    public FilmSession addSession(FilmSession filmSession) {
        return filmSessionRepository.saveAndFlush(filmSession);
    }

    public void deleteSessionById(Long id) {
        if (getSessionById(id) != null) {
            filmSessionRepository.deleteById(id);
        }
    }

    public List<FilmSession> getAllSessionByFilm(Long filmId) {
        return filmSessionRepository.findByFilm(filmRepository.findById(filmId));
    }

    public List<FilmSession> getAllSession() {
        return filmSessionRepository.findAll();
    }


    public FilmSession getSessionById(Long id) {
        return filmSessionRepository.findById(id).orElse(new FilmSession());
    }
}
