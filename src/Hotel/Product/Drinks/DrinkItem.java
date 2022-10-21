package Hotel.Product.Drinks;

import Hotel.Product.Product;

public class DrinkItem extends Product {

  public DrinkItem(String name, double price, Integer quantity, Boolean isAdult) {
    super(name, price, quantity, isAdult);
  }

  public DrinkItem(String name, double price, Integer quantity) {
    super(name, price, quantity);
  }

}
