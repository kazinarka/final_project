package com.nix.cinema.services.impl;

import com.nix.cinema.model.Hall;
import com.nix.cinema.model.Row;
import com.nix.cinema.repository.HallRepository;
import com.nix.cinema.repository.RowRepository;
import com.nix.cinema.services.RowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RowServiceImpl implements RowService {

    private final RowRepository rowRepository;
    private final HallRepository hallRepository;

    @Autowired
    public RowServiceImpl(RowRepository rowRepository, HallRepository hallRepository) {
        this.rowRepository = rowRepository;
        this.hallRepository = hallRepository;
    }

    public void addRow(Row row) {
        rowRepository.saveAndFlush(row);
    }

    public List<Row> getAllRowByHall(Long hallId) {
        return rowRepository.findByHall(hallRepository.findById(hallId));
    }

    public List<Row> getAllRow() {
        return rowRepository.findAll();
    }
}
