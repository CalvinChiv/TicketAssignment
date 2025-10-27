public class TicketTest {
    public static void main(String[] args) {
        Ticket ticket = new WalkupTicket(1.5, 2);
        System.out.println(ticket);

        Ticket ticket1 = new WalkupTicket(2.0);
        System.out.println(ticket1);

        Ticket ticket2 = new WalkupTicket(5);
        System.out.println(ticket2);


    }
}
