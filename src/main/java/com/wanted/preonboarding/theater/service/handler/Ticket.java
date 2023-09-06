package com.wanted.preonboarding.theater.service.handler;

import lombok.Getter;

@Getter
public class Ticket {
    private final Long fee;

    public Ticket(Long fee) {
        this.fee = fee;
    }

}
