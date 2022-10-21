package Hotel.Accommodation.Apartment;

import Hotel.Reservation;
import Hotel.Accommodation.Contracts.AccommodationInterface;

public class TripleApartment implements AccommodationInterface {

  public String name = "Apartamento Triplo";
  public double price = 450;

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
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
