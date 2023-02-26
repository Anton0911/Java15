package org.example;

import java.util.Arrays;

public class TickerManager {
    public final TicketRepository repository;

    public TickerManager(TicketRepository repository) {
        this.repository = repository;
    }

    public void add(Ticket ticket) {
        repository.save(ticket);
    }

    public Ticket[] searchBy(String airportDeparture, String airportArrival) {
        Ticket[] result = new Ticket[0];
        for (Ticket ticket : repository.getTickets()) {
            if (ticket.airportDeparture.contains(airportDeparture) && ticket.airportArrival.contains(airportArrival)) {
                Ticket[] tmp = new Ticket[result.length + 1];
                System.arraycopy(result, 0, tmp, 0, result.length);
                tmp[tmp.length - 1] = ticket;
                result = tmp;
            }
        }
        Arrays.sort(result);
        return result;
    }

}
