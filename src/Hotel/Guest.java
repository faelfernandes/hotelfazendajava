package Hotel;

import Hotel.Product.Products;
import Person.Person;

public class Guest extends Person {

  private Boolean isMainGuest = false;

  public Guest(String name, Integer age, Boolean isMainGuest) {
    super(name, age);
    setMainGuest(isMainGuest);
  }

  public Guest(String name, Integer age) {
    super(name, age);
  }

  public Boolean isMainGuest() {
    return isMainGuest;
  }

  public void setMainGuest(Boolean isMainGuest) {
    this.isMainGuest = isMainGuest;
  }

  public void buyProduct(Reservation reservation, Products product, String name, Integer quantity) {
    product.getProduct().buyItem(reservation, this, name, quantity);
  }

}
