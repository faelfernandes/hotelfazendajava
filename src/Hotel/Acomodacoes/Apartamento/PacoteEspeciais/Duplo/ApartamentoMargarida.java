package Hotel.Acomodacoes.Apartamento.PacoteEspeciais.Duplo;

import Hotel.Reserva;
import Hotel.Acomodacoes.Apartamento.ApartamentoDuplo;

public class ApartamentoMargarida extends ApartamentoDuplo {

  public double preco = 450;

  @Override
  public void regras(Reserva reserva) {
    super.regras(reserva);
    reserva.setIsFree(true);
  }

}
