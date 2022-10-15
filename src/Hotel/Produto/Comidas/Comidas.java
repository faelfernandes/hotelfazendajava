package Hotel.Produto.Comidas;

import java.util.ArrayList;

public class Comidas {

  ArrayList<ComidaItem> bebidasExistentes = new ArrayList<>();

  public Comidas() {
    bebidasExistentes.add(new ComidaItem("Agua", 2.0f, 2, true));
    bebidasExistentes.add(new ComidaItem("Agua", 2.0f, 2, true));
    bebidasExistentes.add(new ComidaItem("Agua", 2.0f, 2, true));
  }

}
