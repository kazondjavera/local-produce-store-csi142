public class Product2Tester {
    public static void main(String[] args) {
        // Test creating a valid product
        try {
            Product2 tomato = new Product2("Tomato", 2.50, 201);
            System.out.println("Product created: " + tomato);
        } catch (NegativePriceException e) {
            System.out.println("Failed to create product: " + e.getMessage());
        }

        // Test creating a product with a negative price
        try {
            Product2 beetroot = new Product2("Beetroot", -1.0, 202);
            System.out.println("Product created: " + beetroot);
        } catch (NegativePriceException e) {
            System.out.println(e.getMessage());
        }
    }
}
