package com.shubh.practice.multithreading.BusReservation;

public class TicketBooking {

   private int availableTickets = 3;

    public synchronized void bookTickets(int noOfTickets, String passengerName){
        if (availableTickets >= noOfTickets && availableTickets <=3){
            System.out.println("No of Tickets booked: " + noOfTickets + " for Passenger: " + passengerName);
            availableTickets = availableTickets-noOfTickets;
        }else {
            System.out.println("Tickets not booked: " + noOfTickets + " for Passenger: " + passengerName);
        }
    }
}
