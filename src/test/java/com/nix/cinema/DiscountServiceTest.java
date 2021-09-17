package com.nix.cinema;

import com.nix.cinema.model.Discount;
import com.nix.cinema.repository.DiscountRepository;
import com.nix.cinema.services.DiscountService;
import com.nix.cinema.services.impl.DiscountServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class DiscountServiceTest {

    DiscountService discountService;
    DiscountRepository discountRepository;

    @BeforeEach
    void setUp() {
        discountRepository = mock(DiscountRepository.class);
        discountService = new DiscountServiceImpl(discountRepository);
    }

    @Test
    void addDiscountTest() {

    }

    @Test
    void getAllDiscountTest() {
        List<Discount> discounts = discountService.getAllDiscount();
        assertEquals(0, discounts.size());
        verify(discountRepository).findAll();
        verifyNoInteractions(discountRepository);
    }

    @Test
    void getDiscountByIdTest() {

    }

    @Test
    void deleteDiscountById() {

    }
}
