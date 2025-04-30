//MainApp Test Class created by Kazo Ndjavera
public class MainApp {
    public static void main(String[] args) {
        //Test ProductSearch
        testProductSearch();
        
        //Test BinarySearchByPrice
        testBinarySearchByPrice();
        
        //Test ProductException
        testProductException();
        
        //Test Sorter2
        testSorter2();
        
        //Test customer purchase 
        testCustomerPurchase();
    }
    
    private static void testProductSearch() {
        System.out.println("\nTesting Product Search ");
        //creation of test products
        Product[] products = {
            new Product("Tomato",2.50, 202),
            new Product("Cabbage", 11.65, 203),
            new Product("Beetroot", 5.75, 201)
        };

        //searching for an existing productID
        int existingId = 201;
        Product foundProduct = ProductSearch.linearSearchByProductID(products, existingId);
        if (foundProduct != null && foundProduct.getProductID() == existingId){
            System.out.println("Product found");
        }
        else{
            System.out.println("Product does not exist");
        }
    }
    
    private static void testBinarySearchByPrice() {
        System.out.println("\nTesting Binary Search by Price ");
        //Create an array (Unsorted)
        Product[] products = {
            new Product("Beetroot", 5.75, 201),
            new Product("Tomato", 2.50, 202),
            new Product("Cabbage", 11.65, 203),
            new Product("Carrot", 4.50, 204),
            new Product("Onion", 3.25, 205)
        };

        //Before sorting
        System.out.println("\nBefore sorting:");
        printProducts(products);

        //Sorting products using insertion sort
        InsertionSort.insertionSortByPrice(products);

        //After sorting
        System.out.println("\nAfter sorting by price:");
        printProducts(products);

         //Implementing iterative binary search by price
        int index = BinarySearchByPrice.binarySearchByPrice(products, 4.50);
        if(index == -1) { //Searching For a price that does not exist in listed products
            System.out.println("Price was not found in the products list");
        } else{
            System.out.println("Found price 4.50 at index: " + index); //If found
        }
    }
    
    private static void testProductException() {
        System.out.println("\nTesting Product Exceptions ");
        // Test creating a valid or an existing product
        try {
            ProductException tomato = new ProductException("Tomato", 2.50, 202);
            System.out.println("Product created: " + tomato);
        } catch (NegativePriceException e) {
            System.out.println("Failed to create product: " + e.getMessage());
        }

        // Test creating a product with a negative price
        try {
            ProductException beetroot = new ProductException("Beetroot", -1.0, 201);
            System.out.println("Product created: " + beetroot);
        } catch (NegativePriceException e) {
            System.out.println("Failed to create product: " + e.getMessage());
        }
    }
    
    private static void testSorter2() {
        System.out.println("\nTesting Sorter2 ");
        // Create 5 vegetable objects
    
        Product[] products = {
            new Product("Beetroot", 5.75, 201),
            new Product("Tomato", 2.50, 202),
            new Product("Cabbage", 11.65, 203),
            new Product("Carrot", 4.50, 204),
            new Product("Onion", 3.25, 205)
        };
        // Print products before sorting
        System.out.println("\nBefore sorting:");
        for (Product p : products) {
            System.out.println(p);
        }
    
        // Sort products by price using Sorter2
        Sorter2.selectionSort(products);

        // Print products after sorting
        System.out.println("\nAfter sorting:");
        for (Product p : products) {
            System.out.println(p);
        }
    }
    
    private static void testCustomerPurchase() {
        System.out.println("\nTesting Customer Purchase ");
        // Create a customer
        Customer customer = new Customer("Kazo Ndjavera", "+267 75347652", "7895 Village");
        
        // Create some products
        Product tomato = new Product("Tomato", 2.50, 202);
        Product carrot = new Product("Carrot", 4.50, 204);
        
                // Simulate purchases
        System.out.println("\n" + customer.getName() + " purchased:");
        System.out.println("- " + tomato.getProductName() + 
                         " (ID: " + tomato.getProductID() + 
                         ") at price: P" + tomato.getPrice());
        System.out.println("- " + carrot.getProductName() + 
                         " (ID: " + carrot.getProductID() + 
                         ") at price: P" + carrot.getPrice());
        
        double total = tomato.getPrice() + carrot.getPrice();
        System.out.println("Total: P" + total);
    }
    
    // Method to print products
    private static void printProducts(Product[] products) {
        for(Product prod : products) {
            System.out.println(prod.getProductName() + " P" + prod.getPrice() + 
                             "(PRODUCT ID: " + prod.getProductID() + ")");
        }
    }
}