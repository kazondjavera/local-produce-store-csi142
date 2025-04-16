We chose a local produce marketplace scenario where there is detailing of produce features and detailing of customers’ information to make buying of produce more easy and efficient. The classes we created are Product, Customer and a Purchasable interface.

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
For Next Week: we intend to introduce domain-specific exceptions such as InvalidPhoneNumberException and InvalidPriceException in order to ensure that phone numbers are always in a certain specified format and that prices are always valid and never negative. 
Repository Name: local-market-produce-store-csi142
Repository Link: https://github.com/kazondjavera/local-market-produce-store-csi142.git

Commits:  
1. "Added domain class Product with fields."  
2. " Added domain class Product with fields."  
 
 
Authors: Kathleen Kgomotso, Boathotswe Beverly Mogaetsho, Kazo Ndjavera, Cathrine Molatedi 

