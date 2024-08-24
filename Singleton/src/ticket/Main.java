package ticket;

public class Main {
    public static void main(String[] args) {
        TicketMaker tm = TicketMaker.getInstance();

        System.out.println("번호 : " + tm.getNextTicketNumber());
        System.out.println("번호 : " + tm.getNextTicketNumber());
        System.out.println("번호 : " + tm.getNextTicketNumber());
    }
}
