package com.nix.cinema.services;

import com.nix.cinema.model.FilmSession;

import java.util.List;

public interface FilmSessionService {

    FilmSession addSession(FilmSession filmSession);

    void deleteSessionById(Long id);

    List<FilmSession> getAllSession();

    List<FilmSession> getAllSessionByFilm(Long filmId);

    List<FilmSession> getAllSessionByHall(Long hallId);

    FilmSession getSessionById(Long id);
}
