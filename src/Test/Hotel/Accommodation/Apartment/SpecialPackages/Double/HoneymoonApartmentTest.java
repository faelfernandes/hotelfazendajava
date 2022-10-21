package Test.Hotel.Accommodation.Apartment.SpecialPackages.Double;

import Hotel.Guest;
import Hotel.Reservation;
import Hotel.Accommodation.Accommodation;
import Hotel.Activity.Activities;
import Hotel.Product.Products;

public class HoneymoonApartmentTest {

  public static void test() {
    Reservation reservation = new Reservation();

    Guest[] guests = new Guest[2];
    guests[0] = new Guest("Francisco", 43, true);
    guests[1] = new Guest("Maria", 38);

    reservation.setGuests(guests);
    reservation.setAccommodation(Accommodation.APARTAMENTO_DUPLO_LUA_DE_MEL);

    reservation.addActivity(Activities.PASSEIO_A_CAVALO);

    reservation.confirmReservation();

    guests[1].buyProduct(reservation, Products.BEBIDA, "Cerveja", 5);

    reservation.finalizeReservation();
  }

}
