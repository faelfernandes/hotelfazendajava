package Hotel.Product;

public class Product {

  private String name;
  private double price = 0;
  private Integer quantity = 0;
  private Boolean isAdult = false;

  public Product(String name, double price, Integer quantity, Boolean isAdult) {
    this.name = name;
    this.price = price;
    this.quantity = quantity;
    this.isAdult = isAdult;
  }

  public Product(String name, double price, Integer quantity) {
    this.name = name;
    this.price = price;
    this.quantity = quantity;
  }

  public Boolean getIsAdult() {
    return isAdult;
  }

  public void setIsAdult(Boolean isAdult) {
    this.isAdult = isAdult;
  }

  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}
