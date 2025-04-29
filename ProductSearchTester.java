public class ProductSearchTester{
    public static void main(String[] args){
        //creation of test products
        Product[] products = {
            new product(1000),
            new product(3000),
            new product(1002)
        };

        //searching for an existing productID
        int existingId = 3000;
        Product foundProduct = ProductSearch.linearSearchByProductID(products, existingId);
        if (foundProduct != null && foundProduct.getProductID() == existingId){
            System.out.println("Product found");
        }
        else{
            System.out.println("Product does not exist");
        }
    }
}