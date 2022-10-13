/* Os chalés possuem tamanhos diferentes, podendo ter 2 ou 3 quartos. São as 
hospedagens mais caras do hotel-fazenda. */

package Hotel.Acomodacoes.Chale;

import Hotel.Reserva;
import Hotel.Acomodacoes.Contracts.RegraDeAcomodacao;

public class ChaleDuplo implements RegraDeAcomodacao {

  public double preco = 450;

  public void checkGrupoFamiliar(Boolean isGroupFamiliar) {
    if (!isGroupFamiliar) {
      System.out.println("Não é do grupo familiar");
    }
    System.out.println("Chale: checkGrupoFamiliar");
  }

  @Override
  public void regras(Reserva reserva) {
    this.checkGrupoFamiliar(reserva.getGroupoFamiliar());
  }

}
