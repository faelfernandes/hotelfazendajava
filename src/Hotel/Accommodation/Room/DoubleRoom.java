package Hotel.Accommodation.Room;

import Hotel.Reservation;
import Hotel.Accommodation.Contracts.AccommodationInterface;

public class DoubleRoom implements AccommodationInterface {

  public String name = "Quarto Duplo";
  public double price = 250;
  private int maxNumberPeople = 2;

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
    this.maxNumberPeople(reservation.getGuests().length);
  }

  public void maxNumberPeople(Integer quantity) {
    if (quantity > maxNumberPeople)
      System.out.println("O quarto não pode hospedar mais que duas pessoas");
  }

}
