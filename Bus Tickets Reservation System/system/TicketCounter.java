package system;

public class TicketCounter {

    private int availableSeats = 3;

    public synchronized void bookTickets(String passenger, int numberOfSeats) {
        if((availableSeats >= numberOfSeats) && (numberOfSeats > 0)) {
            System.out.println("Hi, " + passenger + "! You've successfully booked " + numberOfSeats + " seats.");
            availableSeats = availableSeats - numberOfSeats;
        } else {
            System.out.println("I am sorry " + passenger + ", there are less than " + numberOfSeats + " seats available.");
        }
    }
}
