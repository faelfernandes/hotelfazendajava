package Hotel.Product.Foods;

import java.util.ArrayList;

import Hotel.Guest;
import Hotel.Reservation;
import Hotel.Product.Contracts.ProductInterface;

public class Foods implements ProductInterface {

  ArrayList<FoodItem> existingFoods = new ArrayList<>();

  public Foods() {
    existingFoods.add(new FoodItem("Agua", 2.5, 10));
    existingFoods.add(new FoodItem("Cerveja", 6, 10, true));
    existingFoods.add(new FoodItem("Limonada", 4.5, 10));
  }

  @Override
  public void buyItem(Reservation reservation, Guest guest, String name, Integer quantity) {
  }

}
