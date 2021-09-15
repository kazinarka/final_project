package com.nix.cinema.model;

import lombok.Value;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Value
@Embeddable
class Seat {

    @ManyToOne
    @JoinColumn(name = "row_id")
    private Row row;

    private Integer seat;

    public Seat() {
        seat = null;
        row = null;
    }
}
