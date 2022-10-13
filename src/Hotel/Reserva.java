package Hotel;

import Hotel.Acomodacoes.Acomodacao;

public class Reserva {

  private double valorTotal = 0;
  private Boolean isGroupoFamiliar = false;
  private Hospede[] hospedes;
  private Acomodacao acomodacao;

  public Acomodacao getAcomodacao() {
    return acomodacao;
  }

  public void setAcomodacao(Acomodacao acomodacao) {
    this.acomodacao = acomodacao;
  }

  public void setValorTotal(double valorTotal) {
    this.valorTotal = valorTotal;
  }

  public void setHospedes(Hospede[] hospedes) {
    this.hospedes = hospedes;
  }

  public void setIsGroupoFamiliar(Boolean isGroupoFamiliar) {
    this.isGroupoFamiliar = isGroupoFamiliar;
  }

  public Hospede[] getHospedes() {
    return hospedes;
  }

  public Boolean getGroupoFamiliar() {
    return isGroupoFamiliar;
  }

  public double getValorTotal() {
    return valorTotal;
  }

  public void verificaRegras() {
    acomodacao.getRegra().regras(this);
  }

  /* Somar valor final da reserva ao fazer checkout */

}
