public class InsertionSort{
    public static void insertionSortByPrice(Product[] products){
        for (int i  = 1; i< products.length; i++){
            Product key = products[i];
            int j = i - 1;

            while (j>= 0 && products[j].getPice() > key.getPrice()){
                products[j + 1]= products[j];
                j--;
            }
            products[ j + 1] = key;
        }

    }
    public static void main(Strin[]args)
}
