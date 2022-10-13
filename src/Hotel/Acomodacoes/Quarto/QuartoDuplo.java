/* Cada quarto no hotel, que são as acomodações mais baratas, podem ser simples,
que acomoda uma única pessoa, ou duplo, que acomoda no máximo 2 pessoas.  */

package Hotel.Acomodacoes.Quarto;

import Hotel.Reserva;
import Hotel.Acomodacoes.Contracts.RegraDeAcomodacao;

public class QuartoDuplo implements RegraDeAcomodacao{

  public double preco = 250;

  public void checkMaxPeoples(Integer qtd) {
    if (qtd > 2) {
      System.out.println("O quarto não pode hospedar mais que duas pessoas");
    }
  }

  @Override
  public void regras(Reserva reserva) {
    this.checkMaxPeoples(reserva.getHospedes().length);
  }

}
