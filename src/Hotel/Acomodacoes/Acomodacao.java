package Hotel.Acomodacoes;

import Hotel.Acomodacoes.Apartamento.ApartamentoDuplo;
import Hotel.Acomodacoes.Apartamento.ApartamentoTriplo;
import Hotel.Acomodacoes.Apartamento.PacoteEspeciais.Duplo.ApartamentoLuaDeMel;
import Hotel.Acomodacoes.Apartamento.PacoteEspeciais.Duplo.ApartamentoMargarida;
import Hotel.Acomodacoes.Chale.ChaleDuplo;
import Hotel.Acomodacoes.Chale.ChaleTriplo;
import Hotel.Acomodacoes.Quarto.QuartoDuplo;
import Hotel.Acomodacoes.Quarto.QuartoSimples;
import Hotel.Acomodacoes.Contracts.RegraDeAcomodacao;

public enum Acomodacao {

  /* Quartos */
  QUARTO_SIMPLES(new QuartoSimples()),
  QUARTO_DUPLO(new QuartoDuplo()),

  /* Apartamentos */

  APARTAMENTO_DUPLO(new ApartamentoDuplo()),
  APARTAMENTO_TRIPLO(new ApartamentoTriplo()),
  APARTAMENTO_DUPLO_LUA_DE_MEL(new ApartamentoLuaDeMel()),
  APARTAMENTO_DUPLO_MARGARIDA(new ApartamentoMargarida()),

  /* Chalés */
  CHALE_DUPLO(new ChaleDuplo()),
  CHALE_TRIPLO(new ChaleTriplo());

  private RegraDeAcomodacao regras;

  Acomodacao(RegraDeAcomodacao regras) {
    this.regras = regras;
  }

  public RegraDeAcomodacao getRegra() {
    return regras;
  }
}
