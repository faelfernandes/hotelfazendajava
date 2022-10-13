/* Cada quarto no hotel, que são as acomodações mais baratas, podem ser simples,
que acomoda uma única pessoa, ou duplo, que acomoda no máximo 2 pessoas.  */

package Hotel.Acomodacoes.Quarto;

import Hotel.Reserva;
import Hotel.Acomodacoes.Contracts.RegraDeAcomodacao;

public class QuartoSimples implements RegraDeAcomodacao{

  public double preco = 150;

  public void checkMaxPeoples(Integer qtd) {
    if (qtd > 1) {
      System.out.println("O quarto simples não pode hospedar mais que uma pessoa");
    }
  }

  @Override
  public void regras(Reserva reserva) {
    this.checkMaxPeoples(reserva.getHospedes().length);
  }

}
