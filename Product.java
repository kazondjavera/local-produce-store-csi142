/**
 * Code to classify a product
 * @Version1.0
 * @Authors: Boathotswe Beverly Mogaetsho, Kathleen Kgomotso, Catherine Molatedi & Kazo Ndjavera
 * How to compile: javac Product.java
 * How to execute: java Product
 */
public class Product implements Purchasable {          // product details
    private String productName;        
    private double price;
    private int productID;

    //constructor
    public Product(String productName, double price, int productID) {
        this.productName = productName;
        this.price = price;
        this.productID = productID;
        setPrice(price);    //use of setter to enforce validation
    }
    
    public String getProductName() {  //getter
        return productName;
    }

    public void setProductName(String productName) {   //setter
        this.productName = productName;
    }
    
    public double getPrice() {  // getter
        return price;
    }

    public void setPrice(double price) {  //setter
        this.price = price;
    }

    public int getProductID() {  //getter
        return productID;
    }
    
    public void setProductID(int productID) {   //setter
        this.productID = productID;
    }

    @Override
    public String toString() {
        return productName + "(" + productID + ")" + ":" + price;
    }
}