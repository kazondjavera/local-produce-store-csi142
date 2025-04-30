We chose a local produce marketplace scenario where there is detailing of produce features and detailing of customers’ information to make buying of produce more easy and efficient. The classes we created are Product, Customer and a Purchasable interface.

Repository Name: local-market-produce-store-csi142
Repository Link: https://github.com/kazondjavera/local-market-produce-store-csi142.git


Purchasable Interface
Purpose: to define a common contract for any item that can be purchased
Key Features: 
-	requires implementing of classes to provide a getPrice( ) method
-	Enables polymorphism, allowing different purchasable items to be treated uniformly


Product Class
Purpose: represents a tangible or digital item available for purchase
Fields:  productID(int)
             productName(String)
             price(double)
Key Features: 
-	implements Purchasable and provides a getPrice( ) method to return he product’s price
-	Facilitates encapsulation. 
-	String representation. Overrides toString( ) for readable output


Customer Class
Purpose: models a customer’s basic information 
Fields:  name(String)
             phoneNumber(String)
             address(String)
Key Features:
-	Facilitates encapsulation


Sorter2 and Sorter2Tester

Purpose: Sorter2 is a class that implements selection sort by selecting certain prices and sorting them in acsending order.

-Sorter2Tester is the tester class for it to check if it compiles and runs properly. Uses anarray to select products and their prices,prints the output before sorting and after sorting.



ProductSearch and ProductSearchTester

Purpose: ProductSearch is a class that implements linear search by finding a product using productID.

-ProductSearchTester is the tester class to ensure it compiles and runs properly. Uses an array to select products and their ID's, prints "Found product" when productID is found and "Product not found" when productID is not found.



ProductException and ProductExceptionTester

Purpose: ProductException is a class that implements exceptions to make sure that product prices are non negative.

-ProductExceptionTester is a tester class to ensure that it compiles and runs properly. Also uses ana array to get product prices.



BinarySearchByPrice and BinarySearchByPriceTester

Purpose: BinarySearchByPrice is a class that implements binary search by finding a price that exists in listed products.

-BinarySearchByPriceTester is the tester class to ensure that it compiles and runs properly. Prints output to indicate if product was found by price and also prints output if no product was found by price.



InsertionSort and InsertionSortTester

Purpose: InsertionSort is a class that implements insertion sort by sorting prices in acsending order.

-InsertionSortTester is the tester class for it to check if it compiles and runs properly. Uses an array to select products by their prices at random, prints output before sorting and after sorting. 

