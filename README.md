# EPAssignment

### Bhai kiya hai ye.?


Consider a company XXX sells electronic products. There are three types of products they sell, namely (i) Smart Phone, (ii) Television and (iii) Laptop. The following table lists the product descriptions that are stored for each individual product type.

Smart Phone [Warranty BrandName ScreenSize Storage] Television [Warranty BrandName ScreenSize EnergyRating Weight] Laptop [Warranty BrandName ScreenSize RAM OperatingSystem]

Task 1: Create an appropriate hierarchy of classes using Inheritance. Place the product description fields in super class or subclass, where it is appropriate. Define constructors and proper get and set methods for all the fields.

The company XXX maintains a stock of their products. It imposes restrictions on the quantity of each individual product they stock as well as an overall restriction on the total number of products they can store. While stocking the products in the storage, they maintain a digital repository. The repository can be populated using a file or can be manually entered from the console. Consider the file “Stocks.txt” as the template for populating the repository.

Task 2: Define a class “Stocks” whose object can be used as the repository. Moreover define an Interface “StockLimit” that will define the maximum number of each products and the maximum number of total stock that XXX can store in its repository.

Task 3: Define a method to read the text file “Stocks.txt” and generate objects of the corresponding type of product using the corresponding classes’ constructor. You are to create as many objects as indicated by “Quantity” in “Stocks.txt”.

Task 4: Maintain the current level of stocks for each element and check it with the maximum limit (as defined in Task 2) before creating the product objects in Task 3. Moreover, define an exception class “StockLimitException” and throw it when the total stock limit is reached to abort further attempt to create product objects. Also include appropriate try-catch block.

Task 5: Similarly, define a method to populate the product objects from Console using the same format as described in “Stocks.txt”.

Task 6: Save the current repository in a file (ex., “Repository.txt”). Create one record for each product in your digital repository and write the quantity field as 1.

Task 7: Define an appropriate test class with main function to demonstrate the functionalities of your code.



## Stocks.txt ka format kaha hai.???
## Wo Stocks.java se dekh kar khud banana hy ... -.-
