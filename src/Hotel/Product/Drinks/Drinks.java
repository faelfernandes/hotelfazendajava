package Hotel.Product.Drinks;

import java.util.ArrayList;

import Hotel.Guest;
import Hotel.Reservation;
import Hotel.Product.Contracts.ProductInterface;

public class Drinks implements ProductInterface {

  ArrayList<DrinkItem> existingDrinks = new ArrayList<>();

  public Drinks() {
    existingDrinks.add(new DrinkItem("Água", 2f, 12));
    existingDrinks.add(new DrinkItem("Laranjada", 4.5f, 10));
    existingDrinks.add(new DrinkItem("Cerveja", 6f, 5, true));
  }

  @Override
  public void buyItem(Reservation reservation, Guest guest, String name, Integer quantity) {
    for (DrinkItem drink : this.existingDrinks) {
      if (drink.getName().equals(name)) {

        if (drink.getIsAdult() && guest.getAge() < 18) {
          System.out.println(guest.getName() + " tentou comprar " + drink.getName() + " mas este item não está disponível para menor de idade");
          return;
        }

        if (quantity > drink.getQuantity()) {
          System.out.println(drink.getName() + " > Limite indisponível, temos apenas " + drink.getQuantity() + " no estoque");
          return;
        }

        if (!reservation.isFreeConsumables())
          reservation.setTotalAmount(reservation.getTotalAmount() + quantity * drink.getPrice());

        drink.setQuantity(drink.getQuantity() - quantity);
        System.out.println();
        System.out.println("Compra efetuada > Hospede: " + guest.getName() + " | Item: " + name + " | Quantidade: "
            + quantity + " | R$: " + quantity * drink.getPrice());
      }
    }

    if (reservation.isFreeConsumables())
      System.out.println("\n > Devido ao seu pacote os valores não serão cobrados");

  }

}
