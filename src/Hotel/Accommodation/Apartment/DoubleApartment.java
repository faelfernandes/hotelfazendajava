package Hotel.Accommodation.Apartment;

import Hotel.Reservation;
import Hotel.Accommodation.Contracts.AccommodationInterface;

public class DoubleApartment implements AccommodationInterface {

  public String name = "Apartamento Duplo";
  public double price = 350;

  public double getPrice() {
    return price;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public void rules(Reservation reservation) {

  }

}
