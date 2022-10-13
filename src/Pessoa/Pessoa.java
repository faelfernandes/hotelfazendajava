/* Uma pessoa pode reservar uma ou diversas acomodações. Se ela reservar o tipo 
de acomodação chalé ela dever pertencer a um grupo familiar, uma vez que chalés 
só podem ser reservados para famílias. Já os quartos e apartamentos podem ser 
reservados por qualquer tipo de pessoa. */

/* Ainda no ato da reserva, a pessoa pode reservar atividades do hotel, tais 
como, caminhada com instrutor, passeio a cavalo, pescaria etc. */

package Pessoa;

public class Pessoa {
  private String name;
  private Integer idade;

  public Pessoa(String name, Integer idade) {
    setName(name);
    setIdade(idade);
  }

  public String getName() {
    return name;
  }

  public Integer getIdade() {
    return idade;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setIdade(Integer idade) {
    this.idade = idade;
  }

}
