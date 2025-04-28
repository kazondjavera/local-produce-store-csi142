public class Sorter2Tester {
    public static void main(String[] args) {
        // Create 6 vegetable objects
        Product[] products = new Product[6];
        products[0] = new Product("Carrot", 1.90 ,101);
        products[1] = new Product("Potato", 1.88 ,102);
        products[2] = new Product("Cabbage", 2.35, 103);
        products[3] = new Product("Onion", 2.50 ,104);
        products[4] = new Product("Pumpkin", 3.50 ,105);
        products[5] = new Product("Sweet Potato", 4.50 ,106);

        // Print products before sorting
        System.out.println("Before sorting:");
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
}
