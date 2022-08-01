/*
* This example defines a class named Car.
* public is an access level modifier that allows other classes to interact with this class.
* For now, all classes will be public.
* 


to create a new instance of a class. We NEED to use the 'new' statemtn!


We’ll add data to an object by introducing instance variables, or instance fields.
*/


public class Store {
    // instance fields
    String productType;
    int inventoryCount;
    double inventoryPrice;
    
    // constructor method
    public Store(String product, int count, double price) {
      // parameter values assignend to the right instance fields
      productType = product;
      inventoryCount = count;
      inventoryPrice = price;
    }
    
    // main method
    public static void main(String[] args) {
      Store lemonadeStand = new Store("lemonade", 42, .99);
      Store cookieShop = new Store("cookies", 12, 3.75);
      
      System.out.println("Our first shop sells " + lemonadeStand.productType + " at " + lemonadeStand.inventoryPrice + " per unit.");
      
      System.out.println("Our second shop has " + cookieShop.inventoryCount + " units remaining.");
    }
  }