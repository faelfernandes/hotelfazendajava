package Hotel.Product;

import Hotel.Product.Contracts.ProductInterface;
import Hotel.Product.Drinks.Drinks;
import Hotel.Product.Foods.Foods;

public enum Products {
  BEBIDA(new Drinks()),
  COMIDA(new Foods());

  private ProductInterface product;

  Products(ProductInterface product) {
    this.product = product;
  }

  public ProductInterface getProduct() {
    return product;
  }

}