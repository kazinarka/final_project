package com.nix.cinema.repository;

import com.nix.cinema.model.FilmSession;
import com.nix.cinema.model.Hall;
import com.nix.cinema.model.Row;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface RowRepository extends JpaRepository<Row, Long> {

    List<Row> findByHall(Optional<Hall> byId);
}
