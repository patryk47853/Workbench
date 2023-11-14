package client;

import system.TicketBookingThread;
import system.TicketCounter;

public class Client {
    public static void main(String[] args) {
        TicketCounter ticketCounter = new TicketCounter();
        TicketBookingThread t1 = new TicketBookingThread(ticketCounter, "Patryk", 2);
        TicketBookingThread t2 = new TicketBookingThread(ticketCounter, "John", 2);

        t1.start();
        t2.start();
    }
}
