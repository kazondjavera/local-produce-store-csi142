public class ProductSearch{
    //linear search to find a product by productID using an array
    public static Product linearSearchByProductID(Product[] products, int targetID) {
        for(Product product : products) {
            if(product.getProductID() == targetID) {
                return product;
            }
        }
        return null;  // return null if not found
    }
}