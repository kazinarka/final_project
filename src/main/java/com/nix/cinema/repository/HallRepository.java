package com.nix.cinema.repository;

import com.nix.cinema.model.Cinema;
import com.nix.cinema.model.Hall;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface HallRepository extends JpaRepository<Hall, Long> {

    List<Hall> findByCinema(Optional<Cinema> byId);
}
