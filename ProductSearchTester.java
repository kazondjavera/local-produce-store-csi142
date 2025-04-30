public class ProductSearchTester{
    public static void main(String[] args){
        //creation of test products
        Product[] products = {
            new product(101),
            new product(102),
            new product(103)
        };

        //searching for an existing productID
        int existingId = 103;
        Product foundProduct = ProductSearch.linearSearchByProductID(products, existingId);
        if (foundProduct != null && foundProduct.getProductID() == existingId){
            System.out.println("Product found");
        }
        else{
            System.out.println("Product does not exist");
        }
    }
}
