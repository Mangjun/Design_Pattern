package ticket;

public class TicketMaker {
    private static TicketMaker instance = new TicketMaker();
    private int ticket = 1000;

    private TicketMaker() {

    }

    public static TicketMaker getInstance() {
        return instance;
    }

    public int getNextTicketNumber() {
        return ticket++;
    }
}
