public class ProductExceptionTester {
    public static void main(String[] args) {
        // Test creating a valid product
        try {
            ProductException tomato = new ProductException("Tomato", 2.50, 201);
            System.out.println("Product created: " + tomato);
        } catch (NegativePriceException e) {
            System.out.println("Failed to create product: " + e.getMessage());
        }

        // Test creating a product with a negative price
        try {
            ProductException beetroot = new ProductException("Beetroot", -1.0, 202);
            System.out.println("Product created: " + beetroot);
        } catch (NegativePriceException e) {
            System.out.println("Failed to create product: " + e.getMessage());
        }
    }
}
