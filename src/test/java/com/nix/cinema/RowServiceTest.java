package com.nix.cinema;

import com.nix.cinema.model.Row;
import com.nix.cinema.repository.HallRepository;
import com.nix.cinema.repository.RowRepository;
import com.nix.cinema.services.RowService;
import com.nix.cinema.services.impl.RowServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class RowServiceTest {

    RowService rowService;
    HallRepository hallRepository;
    RowRepository rowRepository;

    @BeforeEach
    void setUp() {
        hallRepository = mock(HallRepository.class);
        rowRepository = mock(RowRepository.class);
        rowService = new RowServiceImpl(rowRepository, hallRepository);
    }

    @Test
    void addRowTest() {

    }

    @Test
    void getAllRowTest() {
        List<Row> rows = rowService.getAllRow();
        assertEquals(0, rows.size());
        verify(rowRepository).findAll();
        verifyNoInteractions(rowRepository);
    }

    @Test
    void getAllRowByHallTest() {

    }
}
