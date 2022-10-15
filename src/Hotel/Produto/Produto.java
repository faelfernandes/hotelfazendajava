/* Produtos sem álcool são consumidos por qualquer pessoa no hotel-fazenda e 
produtos com álcool por apenas maiores de idade. No momento em que se consome 
um produto no hotel-fazenda, é anotado o número da acomodação em que o hóspede 
está, para no final poder gerar o checkout. */

package Hotel.Produto;

public class Produto {

  private String name;
  private double price = 0;
  private Integer quantity = 0;
  private Boolean isMaior = false;

  public Produto(String name, double price, Integer quantity, Boolean isMaior) {
    this.name = name;
    this.price = price;
    this.quantity = quantity;
    this.isMaior = isMaior;
  }

  public Produto(String name, double price, Integer quantity) {
    this.name = name;
    this.price = price;
    this.quantity = quantity;
  }

  public Boolean getIsMaior() {
    return isMaior;
  }

  public void setIsMaior(Boolean isMaior) {
    this.isMaior = isMaior;
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
