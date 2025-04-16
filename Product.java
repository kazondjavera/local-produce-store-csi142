public class Product {
    String productName;
    int price;
    int productID;

    public Product(String productName, int price, int productID) {
        this.productName = productName;
        this.price = price;
        this.productID = productID;
    }
    //setter and getter methods
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
    
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
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
        return productName + "(" + productID + ")" + ":" + price;
    }
}
