package Test.Hotel.Accommodation.Chalet;

import Hotel.Guest;
import Hotel.Reservation;
import Hotel.Accommodation.Accommodation;
import Hotel.Activity.Activities;
import Hotel.Product.Products;

public class TripleChaletTest  {

  public static void test() {
    Reservation reservationTwo = new Reservation();
    reservationTwo.setFamilyGroup(true);

    Guest[] guestsTwo = new Guest[3];
    guestsTwo[0] = new Guest("Francisco", 43, true);
    guestsTwo[1] = new Guest("Maria", 38);
    guestsTwo[2] = new Guest("Joãozinho", 6);

    reservationTwo.setGuests(guestsTwo);
    reservationTwo.setAccommodation(Accommodation.CHALE_TRIPLO);

    reservationTwo.addActivity(Activities.PASSEIO_A_CAVALO);
    reservationTwo.addActivity(Activities.CAMINHADA_COM_INSTRUTOR);
    reservationTwo.addActivity(Activities.PESCARIA);

    reservationTwo.confirmReservation();

    guestsTwo[2].buyProduct(reservationTwo, Products.BEBIDA, "Água", 2);
    guestsTwo[2].buyProduct(reservationTwo, Products.BEBIDA, "Cerveja", 42);

    reservationTwo.finalizeReservation();
  }

}
