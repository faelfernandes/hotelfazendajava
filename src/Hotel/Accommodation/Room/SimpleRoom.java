package Hotel.Accommodation.Room;

import Hotel.Reservation;
import Hotel.Accommodation.Contracts.AccommodationInterface;

public class SimpleRoom implements AccommodationInterface {

  public String name = "Quarto Simples";
  public double price = 150;
  private int maxNumberPeople = 1;

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
    if (quantity > maxNumberPeople) {
      System.out.println("O quarto simples não pode hospedar mais que uma pessoa");
      System.exit(0);
    }
  }

}
