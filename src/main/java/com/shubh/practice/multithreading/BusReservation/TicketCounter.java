package com.shubh.practice.multithreading.BusReservation;

public class TicketCounter implements Runnable{

    private int noOfTickets;
    private String passengerName;
    private TicketBooking ticketBooking;

    public TicketCounter(TicketBooking ticketBooking, int noOfTickets, String passengerName) {
        this.noOfTickets = noOfTickets;
        this.passengerName = passengerName;
        this.ticketBooking = ticketBooking;
    }

    @Override
    public void run() {
        ticketBooking.bookTickets(noOfTickets, passengerName);
    }
}
