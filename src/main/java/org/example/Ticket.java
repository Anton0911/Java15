package org.example;

public class Ticket implements Comparable<Ticket> {
    public void setId(int id) {
        this.id = id;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setAirportDeparture(String airportDeparture) {
        this.airportDeparture = airportDeparture;
    }

    public void setAirportArrival(String airportArrival) {
        this.airportArrival = airportArrival;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public Ticket(int id, int cost, String airportDeparture, String airportArrival, int time) {
        this.id = id;
        this.cost = cost;
        this.airportDeparture = airportDeparture;
        this.airportArrival = airportArrival;
        this.time = time;
    }

    protected int id;
    protected int cost;
    protected String airportDeparture;
    protected String airportArrival;
    protected int time;

    public int getId() {
        return id;
    }

    public int getCost() {
        return cost;
    }

    public String getAirportDeparture() {
        return airportDeparture;
    }

    public String getAirportArrival() {
        return airportArrival;
    }

    public int getTime() {
        return time;
    }

    @Override
    public int compareTo(Ticket o) {
        if (cost < o.getCost()) {
            return -1;
        }
        if (cost > o.getCost()) {
            return 1;
        }
        return 0;
    }
}
