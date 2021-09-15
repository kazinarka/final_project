package com.nix.cinema.services;

import com.nix.cinema.model.Discount;

import java.util.List;

public interface DiscountService {

    List<Discount> getAllDiscount();

    Discount getDiscountByID(Long id);

    void deleteDiscountByID(Long id);

    void addDiscount(Discount discount);
}
