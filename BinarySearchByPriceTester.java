public class BinarySearchByPriceTester {
    public static void main(String[] args) {
        //Create an array (Unsorted)
        Product[] products = {
            new Product("Beetroot", 5.75, 201),
            new Product("Tomato", 2.50, 202),
            new Product("Cabbage", 11.65, 203),
            new Product("Carrot", 4.50, 204),
            new Product("Onion", 3.25, 205)
        };

        //Before sorting
        System.out.println("Before sorting:");
        printProducts(products);

        //Sorting products using insertion sort
        InsertionSort.insertionSortByPrice(products);

        //After sorting
        System.out.println("After sorting by price:");
        printProducts(products);

         //Implementing iterative binary search by price
                int index = BinarySearchByPrice.binarySearchByPrice(products, 4.50);
            if(index == -1) { //Searching For a price that does not exist in listed products
            System.out.println("Price was not found in the products list");
            } else{
               System.out.println("Found price 4.50 at index: " + index); //If found
            }
    }
    //Method to print products
        private static void printProducts(Product[] products) {
            for(Product prod : products) {
                System.out.println(prod.getProductName() + " P" + prod.getPrice() + "(PRODUCT ID: " + prod.getProductID() + ")");
            }
        }
}
