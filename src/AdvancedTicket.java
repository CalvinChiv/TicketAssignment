public class AdvancedTicket extends Ticket {
    //call constructors must call parents FIRST THING
    public AdvancedTicket(double price, int number, int numOfDaysPurchasedEarlier) {
        super(price, number);
        //discount
        if(numOfDaysPurchasedEarlier > 10) {
            this.price *= 0.6;
        }
        else if (numOfDaysPurchasedEarlier > 0) {
            this.price *= 0.8;
        }
        else {
            throw new IllegalArgumentException("Must be greater than 0");
        }
    }

    public AdvancedTicket(double price, int numOfDaysPurchasedEarlier) {
        this(price, -1, numOfDaysPurchasedEarlier);
    }

    public AdvancedTicket(int number, int numOfDaysPurchasedEarlier) {
        this(50, number, numOfDaysPurchasedEarlier);
    }

    @Override
    public String toString() {
        return "Advanced Ticket, " + super.toString();
    }
}
