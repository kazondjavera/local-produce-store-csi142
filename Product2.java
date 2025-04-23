public class Product2 {
    private String name;
    private double price;
    private int productID; 

    public Product(String name, double price, int productID) throws NegativePriceException {
        this.name = name;
        this.productID = productID;
        this.price = price;
        setPrice(price);
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }
    
    public void setPrice(double price) throws NegativePriceException { //throw exception
        if (price < 0) {
            throw new NegativePriceException("Price cannot be negative: " + price);
        }
        this.price = price;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    @Override
    public String toString() {
        return "Product{" +"name=" + name + ", " +  "price=" + price + ", " + "productID=" + productID + "}";
               
    }
}
