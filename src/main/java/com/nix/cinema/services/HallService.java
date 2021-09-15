package com.nix.cinema.services;

import com.nix.cinema.model.Hall;

import java.util.List;

public interface HallService {

    List<Hall> getAllHall();

    List<Hall> getAllHallByCinema(Long cinemaId);

    Hall getHallByID(Long id);

    void deleteHallByID(Long id);

    void addHall(Hall hall);
}
