package january17;

public abstract class AbstractTour implements Tour {

    protected String destination;

    protected int days;

    protected double pricePerDay;

    public AbstractTour(String destination, int days, double pricePerDay) {
        this.destination = destination;
        this.days = days;
        this.pricePerDay = pricePerDay;
    }

    protected double totalPrice() {
        return pricePerDay * days;
    }

}
