package com.wanted.preonboarding.theater.service.handler;

import lombok.Getter;

@Getter
public class TicketSeller {
    private final TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

}
