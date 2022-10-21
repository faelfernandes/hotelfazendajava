package Test.Hotel.Accommodation.Apartment;

import Hotel.Guest;
import Hotel.Reservation;
import Hotel.Accommodation.Accommodation;
import Hotel.Activity.Activities;
import Hotel.Product.Products;

public class DoubleApartmentTest {
  public static void test() {
    Reservation reservation = new Reservation();

    Guest[] guests = new Guest[3];
    guests[0] = new Guest("Francisco", 43, true);
    guests[1] = new Guest("Maria", 38);
    guests[2] = new Guest("Joãozinho", 6);

    reservation.setGuests(guests);
    reservation.setAccommodation(Accommodation.APARTAMENTO_DUPLO);

    reservation.addActivity(Activities.PASSEIO_A_CAVALO);
    reservation.addActivity(Activities.CAMINHADA_COM_INSTRUTOR);

    reservation.confirmReservation();

    guests[2].buyProduct(reservation, Products.BEBIDA, "Água", 2);
    guests[2].buyProduct(reservation, Products.BEBIDA, "Laranjada", 3);

    reservation.finalizeReservation();
  }

}
