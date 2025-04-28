public class NegativePriceException extends Exception {
    public NegativePriceException(String message) {
        super(message);
    }
    //Method to add invalid price
    private double invalidPrice;
    public NegativePriceException(double price) {
        super("Price cannot be Negative: " + price);
        this.invalidPrice = price;
    }
    public double getInvalidPrice() {
        return invalidPrice;
    }
}

