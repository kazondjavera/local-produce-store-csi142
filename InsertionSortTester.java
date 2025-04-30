import java.util.Arrays;
public class InsertionSortTester{ 
    public static void main(String[] args){
        //an array of product objects with random prices
        Product[] products={
            new Product("Carrot", 1.90, 101),
            new Product("Potato", 1.88, 102),
            new Product("Cabbage", 2.35, 103)
        };
        System.out.println("Before Sorting by price:");
        printProducts(products);
        
        InsertionSort.insertionSortByPrice(products);

        System.out.println("\nAfter Sorting by Price");
        printProducts(products); 
    }

    private static void printProducts(Product[] products){
        for (Product p : products){
            System.out.println(p);
        }
    }

}