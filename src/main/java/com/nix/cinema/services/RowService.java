package com.nix.cinema.services;

import com.nix.cinema.model.Hall;
import com.nix.cinema.model.Row;

import java.util.List;

public interface RowService {

    void addRow(Row row);

    List<Row> getAllRow();

    List<Row> getAllRowByHall(Long hallId);
}
