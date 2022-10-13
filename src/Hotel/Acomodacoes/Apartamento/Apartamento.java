/* Os apartamentos são mais luxuosos podendo ser duplos ou triplos. 
Os apartamentos duplos geralmente possuem alguns pacotes espaciais, tais como, 
pacote Lua de Mel, Pacote Margarida. Dessa forma, o casal que aluga um 
apartamento duplo tem a opção de escolher um tipo de pacote para poder 
desfrutar gratuitamente enquanto estiver hospedado no hotel. */

package Hotel.Acomodacoes.Apartamento;

import Hotel.Reserva;
import Hotel.Acomodacoes.Contracts.RegraDeAcomodacao;

public class Apartamento implements RegraDeAcomodacao {

  @Override
  public void regras(Reserva reserva) {
    System.out.println(reserva.getGroupoFamiliar());
  }

}
