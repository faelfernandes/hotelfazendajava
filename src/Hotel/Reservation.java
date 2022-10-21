package Hotel;

import Hotel.Accommodation.Accommodation;
import Hotel.Accommodation.Contracts.AccommodationInterface;
import Hotel.Activity.Activities;
import Hotel.Activity.Contracts.ActivityInterface;

import java.util.ArrayList;

public class Reservation {

  private double totalAmount = 0;
  private Boolean isFamilyGroup = false;
  private Guest[] guests;
  private Boolean isFreeConsumables = false;
  private ArrayList<ActivityInterface> activities = new ArrayList<>();
  private AccommodationInterface accommodation;

  public AccommodationInterface getAccommodation() {
    return accommodation;
  }

  public void setAccommodation(Accommodation accommodation) {
    this.accommodation = accommodation.getAccommodation();
  }

  public ArrayList<ActivityInterface> getActivities() {
    return activities;
  }

  public void setActivities(ArrayList<ActivityInterface> activities) {
    this.activities = activities;
  }

  public void addActivity(Activities activity) {
    getActivities().add(activity.getActivity());
  }

  public Boolean isFreeConsumables() {
    return isFreeConsumables;
  }

  public void setIsFreeConsumables(Boolean isFreeConsumables) {
    this.isFreeConsumables = isFreeConsumables;
  }

  public void setTotalAmount(double totalAmount) {
    this.totalAmount = totalAmount;
  }

  public void setGuests(Guest[] guests) {
    this.guests = guests;
  }

  public void setFamilyGroup(Boolean isFamilyGroup) {
    this.isFamilyGroup = isFamilyGroup;
  }

  public Guest[] getGuests() {
    return guests;
  }

  public Boolean getFamilyGroup() {
    return isFamilyGroup;
  }

  public double getTotalAmount() {
    return totalAmount;
  }

  public void confirmReservation() {
    setTotalAmount(getTotalAmount() + getAccommodation().getPrice());
    getAccommodation().rules(this);
  }

  public void finalizeReservation() {
    extract();
  }

  public void extract() {
    System.out.println("\n================ RESERVA ================");
    System.out.println("| ");
    System.out.println("| Reserva: " + getAccommodation().getName());
    System.out.println("| Preco: " + getAccommodation().getPrice());
    System.out.println("| ");
    System.out.println("| Hospedes: (" + getGuests().length + ")");
    for (int i = 0; i < getGuests().length; i++)
      System.out.println("|  " + (i + 1) + " - " + getGuests()[i].getName() + " - Idade: "
          + getGuests()[i].getAge() + (getGuests()[i].isMainGuest() ? " (Principal)" : ""));
    System.out.println("| ");
    System.out.println("| Atividades reservadas: (" + getActivities().size() + ")");
    for (int i = 0; i < getActivities().size(); i++)
      System.out.println("|  " + (i + 1) + " - " + getActivities().get(i).getName());
    System.out.println("| ");
    System.out.println("| Valor total: R$ " + this.getTotalAmount());
    System.out.println("| ");
    System.out.println("=========================================");
  }
}
