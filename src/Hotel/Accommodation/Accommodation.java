package Hotel.Accommodation;

import Hotel.Accommodation.Apartment.DoubleApartment;
import Hotel.Accommodation.Apartment.TripleApartment;
import Hotel.Accommodation.Apartment.SpecialPackages.Double.ApartmentMargarida;
import Hotel.Accommodation.Apartment.SpecialPackages.Double.HoneymoonApartment;
import Hotel.Accommodation.Chalet.DoubleChalet;
import Hotel.Accommodation.Chalet.TripleChalet;
import Hotel.Accommodation.Contracts.AccommodationInterface;
import Hotel.Accommodation.Room.DoubleRoom;
import Hotel.Accommodation.Room.SimpleRoom;

public enum Accommodation {

  QUARTO_SIMPLES(new SimpleRoom()),
  QUARTO_DUPLO(new DoubleRoom()),

  APARTAMENTO_DUPLO(new DoubleApartment()),
  APARTAMENTO_TRIPLO(new TripleApartment()),
  APARTAMENTO_DUPLO_LUA_DE_MEL(new HoneymoonApartment()),
  APARTAMENTO_DUPLO_MARGARIDA(new ApartmentMargarida()),

  CHALE_DUPLO(new DoubleChalet()),
  CHALE_TRIPLO(new TripleChalet());

  private AccommodationInterface accommodation;

  Accommodation(AccommodationInterface accommodation) {
    this.accommodation = accommodation;
  }

  public AccommodationInterface getAccommodation() {
    return accommodation;
  }
}
