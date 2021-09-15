package com.nix.cinema.repository;

import com.nix.cinema.model.Film;
import com.nix.cinema.model.FilmSession;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface FilmSessionRepository extends JpaRepository<FilmSession, Long> {

    List<FilmSession> findByFilm(Optional<Film> byId);
}
