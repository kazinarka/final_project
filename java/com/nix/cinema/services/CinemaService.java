package com.nix.cinema.services;

import com.nix.cinema.model.Cinema;
import org.springframework.data.domain.Page;

import java.util.List;

public interface CinemaService {

    Page<Cinema> getAllCinemaPage(Integer pageNumber);

    List<Cinema> getAllCinema();

    void addCinema(Cinema cinema);

    void deleteCinemaByID(Long id);

    Cinema getCinemaByID(Long id);
}
