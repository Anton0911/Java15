package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestTickerManager {
    TicketRepository repository = new TicketRepository();
    TickerManager manager = new TickerManager(repository);
    Ticket ticket1 = new Ticket(1, 100, "MSK", "SPB", 200);
    Ticket ticket2 = new Ticket(2, 150, "SPB", "MSK", 300);
    Ticket ticket3 = new Ticket(3, 500, "MSK", "SPB", 200);
    Ticket ticket4 = new Ticket(4, 400, "MSK", "GOJ", 200);
    Ticket ticket5 = new Ticket(5, 400, "MSK", "KUF", 200);
    Ticket ticket6 = new Ticket(6, 300, "MSK", "SPB", 200);
    Ticket ticket7 = new Ticket(7, 300, "MSK", "KUF", 200);
    Ticket ticket8 = new Ticket(8, 200, "MSK", "GOJ", 200);

    @BeforeEach
    void setUp() {
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);
    }

    @Test
    public void ShouldAllTicket() {
        Ticket[] expected = {ticket1, ticket6, ticket3};
        Ticket[] actual = manager.searchBy("MSK", "SPB");
        assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldNoTicket() {
        Ticket[] expected = {};
        Ticket[] actual = manager.searchBy("MSK", "SKR");
        assertArrayEquals(expected, actual);
    }


}
