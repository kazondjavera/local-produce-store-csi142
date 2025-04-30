public class ProductSearchTester{
    public static void main(String[] args){
        //creation of test products
        Product[] products = {
            new Product("Carrot", 1.99, 101),
            new Product("Potato", 1.88, 102),
            new Product("Cabbage", 2.35, 103)
        };

        //test linear search
        testSearch(products, 102);
        testSearch(products, 777);
    }
    
        private static void testSearch(Product[] products, int targetID){
            System.out.println("\nSearching for product ID: " + targetID);
            Product result = ProductSearch.linearSearchByProductID(products, targetID);

            if(result != null) {
                System.out.println("Found prouct: " + result.getProductName()
                + ", ID: " + result.getProductID() + ", Price: $" + result.getPrice() + ")");
            }
            else{
                System.out.println("Product with ID " + targetID + " not found");
            }
        }
    
}
