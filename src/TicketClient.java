public class TicketClient {

    public static void main(String[] args) {
    	// write your code here
        Ticket t1 = new Ticket(12.0, 123);
        System.out.println(t1);

        Ticket t2 = new Ticket(24.0);
        System.out.println(t2);

        Ticket t3 = new Ticket(456);
        System.out.println(t3);

        Ticket t4 = new AdvancedTicket(100, 1, 20);
        System.out.println(t4);

        Ticket t5 = new AdvancedTicket(100, 2, 20);
        System.out.println(t5);

        Ticket t6 = new StudentAdvanceTicket(100, 3, 20);

        Ticket t7 = new StudentAdvanceTicket(100, 4, 2);

        Ticket t8 = new WalkupTicket(10);
        System.out.println(t8);
    }
}