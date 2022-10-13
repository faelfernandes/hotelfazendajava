package Hotel;

import Pessoa.Pessoa;

public class Hospede extends Pessoa {

  private Boolean principal = false;

  public Hospede(String name, Integer idade, Boolean principal) {
    super(name, idade);
  }

  public Hospede(String name, Integer idade) {
    super(name, idade);
  }

  public Boolean getPrincipal() {
    return principal;
  }

  public void setPrincipal(Boolean principal) {
    this.principal = principal;
  }

}
