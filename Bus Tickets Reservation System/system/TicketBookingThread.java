package system;

public class TicketBookingThread extends Thread {

    private TicketCounter ticketCounter;
    private String passenger;
    private int seatsToBook;

    public TicketBookingThread(TicketCounter ticketCounter, String passenger, int seatsToBook) {
        this.ticketCounter = ticketCounter;
        this.passenger = passenger;
        this.seatsToBook = seatsToBook;
    }

    @Override
    public void run() {
        ticketCounter.bookTickets(passenger, seatsToBook);
    }
}
