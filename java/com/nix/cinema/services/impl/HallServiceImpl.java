package com.nix.cinema.services.impl;

import com.nix.cinema.model.Hall;
import com.nix.cinema.repository.CinemaRepository;
import com.nix.cinema.repository.HallRepository;
import com.nix.cinema.services.HallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HallServiceImpl implements HallService {

    private final HallRepository hallRepository;
    private final CinemaRepository cinemaRepository;

    @Autowired
    public HallServiceImpl(HallRepository hallRepository, CinemaRepository cinemaRepository) {
        this.hallRepository = hallRepository;
        this.cinemaRepository = cinemaRepository;
    }

    public List<Hall> getAllHall() {
        return hallRepository.findAll();
    }

    public List<Hall> getAllHallByCinema(Long cinemaId) {
        return hallRepository.findByCinema(cinemaRepository.findById(cinemaId));
    }

    public Hall getHallByID(Long hallId) {
        return hallRepository.findById(hallId).orElse(new Hall());
    }

    public void deleteHallByID(Long id) {
        if (getHallByID(id) != null) {
            hallRepository.deleteById(id);
        }
    }

    public void addHall(Hall hall) {
        hallRepository.saveAndFlush(hall);
    }

}
