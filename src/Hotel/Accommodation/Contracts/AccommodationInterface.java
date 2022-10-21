package Hotel.Accommodation.Contracts;

import Hotel.Reservation;

public interface AccommodationInterface {

  public String getName();

  public double getPrice();

  public void rules(Reservation reservation);
}