public class BinarySearchByPrice{
    public static int binarySearchByPrice(Product[] products, double targetPrice) {
    int low = 0; //Points to the start of the array(Index 0)
    int high = products.length - 1; //Points to the end of the array(Last index)
    while (low <= high) {
        int mid = (low + high) / 2;
        //Compare the middle element to the target
        if (products[mid].getPrice() == targetPrice) {
            return mid; //Target price found, return the index
        } else if (products[mid].getPrice() < targetPrice) {
            low = mid + 1; //Discard the left half of the array
        } else {
            high = mid - 1; //Discard the right half of the array
        }
    }
    return -1;//Target price not found
 }
}