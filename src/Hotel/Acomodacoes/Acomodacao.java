package Hotel.Acomodacoes;

import Hotel.Acomodacoes.Apartamento.Apartamento;
import Hotel.Acomodacoes.Chale.ChaleDuplo;
import Hotel.Acomodacoes.Chale.ChaleTriplo;
import Hotel.Acomodacoes.Contracts.RegraDeAcomodacao;
import Hotel.Acomodacoes.Quarto.QuartoDuplo;
import Hotel.Acomodacoes.Quarto.QuartoSimples;

public enum Acomodacao {

  /* Quartos */
  QUARTO_SIMPLES(new QuartoSimples()),
  QUARTO_DUPLO(new QuartoDuplo()),

  /* Apartamento */
  APARTAMENTO(new Apartamento()),
  
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
