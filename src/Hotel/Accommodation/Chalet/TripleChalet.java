package Hotel.Accommodation.Chalet;

import Hotel.Reservation;
import Hotel.Accommodation.Contracts.AccommodationInterface;

public class TripleChalet implements AccommodationInterface {

  public String name = "Chalé Triplo";
  public double price = 450;

  @Override
  public String getName() {
    return name;
  }

  @Override
  public double getPrice() {
    return price;
  }

  @Override
  public void rules(Reservation reservation) {
    this.isFamilyGroup(reservation.getFamilyGroup());
  }

  public void isFamilyGroup(Boolean isFamilyGroup) {
    if (!isFamilyGroup) {
      System.out.println("Esta reserva só pode ser feita em uma reserva familiar");
      System.exit(0);
    }
  }

}
