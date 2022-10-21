package Hotel.Product.Contracts;

import Hotel.Guest;
import Hotel.Reservation;

public interface ProductInterface {
  public void buyItem(Reservation reservation, Guest guest, String name, Integer quantity);
}
