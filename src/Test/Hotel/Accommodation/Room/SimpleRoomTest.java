package Test.Hotel.Accommodation.Room;

import Hotel.Guest;
import Hotel.Reservation;
import Hotel.Accommodation.Accommodation;

public class SimpleRoomTest {

  public static void test() {
    /* Quarto Simples */
    Reservation reservation = new Reservation();
    Guest[] guests = new Guest[3];
    guests[0] = new Guest("Rafael", 23, true);
    guests[1] = new Guest("Gabriela", 18);
    guests[2] = new Guest("Gabriela", 18);
    reservation.setGuests(guests);
    reservation.setAccommodation(Accommodation.QUARTO_SIMPLES);
    reservation.confirmReservation();
    reservation.finalizeReservation();
  }

}
