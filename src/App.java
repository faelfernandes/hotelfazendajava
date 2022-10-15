import Hotel.Hospede;
import Hotel.Reserva;
import Hotel.Acomodacoes.Acomodacao;
/* import Hotel.Produto.Produto;
import Hotel.Produto.Produtos;
import Hotel.Produto.Bebidas.Bebidas; */

public class App {
    public static void main(String[] args) throws Exception {

        /* Reserva reservaQuartoDuplo1 = new Reserva();
        Hospede hospedeQuartoDuplo1 = new Hospede("Rafael", 23, true);
        Hospede hospedeQuartoDuplo2 = new Hospede("Gabriela", 18);
        Hospede[] hospedesQuarto = new Hospede[2];
        hospedesQuarto[0] = hospedeQuartoDuplo1;
        hospedesQuarto[1] = hospedeQuartoDuplo2;
        reservaQuartoDuplo1.setHospedes(hospedesQuarto);
        reservaQuartoDuplo1.setAcomodacao(Acomodacao.QUARTO_DUPLO);
        reservaQuartoDuplo1.confirmarReserva(); */

        Reserva reserva2 = new Reserva();
        reserva2.setIsGroupoFamiliar(true);
        Hospede hospedeChale1 = new Hospede("Francisco", 43, true);
        Hospede hospedeChale2 = new Hospede("Maria", 38);
        Hospede hospedeChale3 = new Hospede("Joãozinho", 6);
        Hospede[] hospedes = new Hospede[3];
        hospedes[0] = hospedeChale1;
        hospedes[1] = hospedeChale2;
        hospedes[2] = hospedeChale3;
        reserva2.setHospedes(hospedes);
        reserva2.setAcomodacao(Acomodacao.APARTAMENTO_DUPLO_LUA_DE_MEL);
        reserva2.confirmarReserva();
        // hospedeChale3.pedirProduto(reserva2, Produtos.BEBIDA, "Água", 2);

        // hospedeChale3.pedirProduto(Produto.BEBIDA, "Agua");
    }
}