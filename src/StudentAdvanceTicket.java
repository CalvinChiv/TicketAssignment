public class StudentAdvanceTicket extends AdvancedTicket {

    public StudentAdvanceTicket(double price, int number, int numOfDaysPurchasedEarlier) {
        super(price, number, numOfDaysPurchasedEarlier);
        this.price *= 0.5;
    }

    public StudentAdvanceTicket(double price, int numOfDaysPurchasedEarlier) {
        this(price, -1, numOfDaysPurchasedEarlier);
    }

    public StudentAdvanceTicket(int number, int numOfDaysPurchasedEarlier) {
        this(50, number, numOfDaysPurchasedEarlier);
    }

    @Override
    public String toString() {
        return "Student " + super.toString();
    }
}
