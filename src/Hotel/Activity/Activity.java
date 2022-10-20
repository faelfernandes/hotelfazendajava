package Hotel.Activity;

import Hotel.Activity.Contracts.ActivityInterface;

public class Activity implements ActivityInterface {

  private String name;
  private double price = 0;
  private Boolean isMaior = false;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public Boolean getIsMaior() {
    return isMaior;
  }

  public void setIsMaior(Boolean isMaior) {
    this.isMaior = isMaior;
  }

  @Override
  public Boolean getIsAdult() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void setIsAdult(Boolean isAdult) {
    // TODO Auto-generated method stub
    
  }

}
