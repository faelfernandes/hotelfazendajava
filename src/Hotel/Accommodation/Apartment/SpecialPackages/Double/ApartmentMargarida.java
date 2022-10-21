package Hotel.Accommodation.Apartment.SpecialPackages.Double;

import Hotel.Reservation;
import Hotel.Accommodation.Apartment.DoubleApartment;

public class ApartmentMargarida extends DoubleApartment {

  public String name = "Apartamento Duplo | Margarida";
  private double price = 550;

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
    super.rules(reservation);
    reservation.setIsFreeConsumables(true);
  }

}
