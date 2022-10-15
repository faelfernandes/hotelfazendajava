package Hotel.Produto.Bebidas;

import java.util.ArrayList;

public class Bebidas {

  ArrayList<BebidaItem> bebidasExistentes = new ArrayList<>();

  public Bebidas() {
    bebidasExistentes.add(new BebidaItem("Agua", 2.0f, 2, true));
    bebidasExistentes.add(new BebidaItem("Agua", 2.0f, 2, true));
    bebidasExistentes.add(new BebidaItem("Agua", 2.0f, 2, true));
  }

}
