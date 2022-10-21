package Hotel.Product.Foods;

import Hotel.Product.Product;

public class FoodItem extends Product {

  public FoodItem(String name, double price, Integer quantity, Boolean isAdult) {
    super(name, price, quantity, isAdult);
  }

  public FoodItem(String name, double price, Integer quantity) {
    super(name, price, quantity);
  }

}
