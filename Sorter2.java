import java.util.Arrays;

public class Sorter2 {

    // Selection Sort
    public static void selectionSort(Product[] product) {
        int n = product.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (product[j].getPrice() < product[minIndex].getPrice()) {
                    minIndex = j;
                }
            }
            Product temp = product[minIndex];
            product[minIndex] = product[i];
            product[i] = temp;
        }
    } 
}

