package com.nix.cinema.services.impl;

import com.nix.cinema.model.Discount;
import com.nix.cinema.repository.DiscountRepository;
import com.nix.cinema.services.DiscountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiscountServiceImpl implements DiscountService {

    private final DiscountRepository discountRepository;

    @Autowired
    public DiscountServiceImpl(DiscountRepository discountRepository) {
        this.discountRepository = discountRepository;
    }

    public List<Discount> getAllDiscount() {
        return discountRepository.findAll();
    }

    public Discount getDiscountByID(Long id) {
        return discountRepository.findById(id).orElseThrow(NoClassDefFoundError::new);
    }

    public void deleteDiscountByID(Long id) {
        if(getDiscountByID(id) != null) {
            discountRepository.deleteById(id);
        }
    }

    public void addDiscount(Discount discount) {
        discountRepository.saveAndFlush(discount);
    }
}
