public class WalkupTicket extends Ticket {
    public WalkupTicket(double price, int number) {
        super(price, number);
    }

    public WalkupTicket(double price) {
        super(price);
    }

    public WalkupTicket(int number) {
        super(number);
    }

    @Override
    public String toString() {
        return "Walkup Ticket, " + super.toString();
    }
}
