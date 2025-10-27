public class TicketTest {
    public static void main(String[] args) {
        Ticket ticket = new WalkupTicket(1.5, 2);
        System.out.println(ticket);

        Ticket ticket1 = new WalkupTicket(2.0);
        System.out.println(ticket);

        Ticket ticket2 = new WalkupTicket(5);
        System.out.println(ticket);

        Ticket ticket3 = new AdvancedTicket(15.5, 4, 6);
        System.out.println(ticket3);

        Ticket ticket4 = new AdvancedTicket(20.5, 4);
        System.out.println(ticket4);

        Ticket ticket5 = new AdvancedTicket(4, 4);
        System.out.println(ticket5);
    }
}
