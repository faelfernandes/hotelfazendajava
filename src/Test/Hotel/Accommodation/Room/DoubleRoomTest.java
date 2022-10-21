package Test.Hotel.Accommodation.Room;

import Hotel.Guest;
import Hotel.Reservation;
import Hotel.Accommodation.Accommodation;
import Hotel.Activity.Activities;
import Hotel.Product.Products;

public class DoubleRoomTest {

  public static void test() {
    Reservation reservation = new Reservation();

    Guest[] guests = new Guest[2];
    guests[0] = new Guest("Francisco", 43, true);
    guests[1] = new Guest("Maria", 38);

    reservation.setGuests(guests);
    reservation.setAccommodation(Accommodation.QUARTO_DUPLO);

    reservation.addActivity(Activities.PASSEIO_A_CAVALO);
    reservation.addActivity(Activities.CAMINHADA_COM_INSTRUTOR);

    reservation.confirmReservation();

    guests[1].buyProduct(reservation, Products.BEBIDA, "Água", 2);
    guests[1].buyProduct(reservation, Products.BEBIDA, "Cerveja", 42);

    reservation.finalizeReservation();
  }

}
