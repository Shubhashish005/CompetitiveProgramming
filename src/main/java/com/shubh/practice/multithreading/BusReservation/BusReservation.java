package com.shubh.practice.multithreading.BusReservation;

public class BusReservation {

    public static void main(String[] args) {

        TicketBooking ticketBooking = new TicketBooking();
        Thread t1 = new Thread(new TicketCounter(ticketBooking,2, "Ramesh"));
        Thread t2 = new Thread(new TicketCounter(ticketBooking, 2, "Akash"));
        t1.start();
        t2.start();
    }
}
