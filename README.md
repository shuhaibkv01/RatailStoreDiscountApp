Retail Store Discount App
=================================================

### Steps for running application, test cases and generating the code coverage report

##### Clone the project
    clone https://github.com/shuhaibkv01/RatailStoreDiscountApp.git
  
    
##### Build the package
    mvn package
##### Run the application
    mvn exec:java -Dexec.mainClass=com.xyz.retailstore.main.RetailApplication
##### Run the test cases
    mvn clean test
    
    

The coverage report is generated at `target/my-reports/index.html`.

