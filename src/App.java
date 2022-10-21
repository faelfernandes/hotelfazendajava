import java.util.Scanner;
import java.io.IOException;

import Test.Hotel.Accommodation.Apartment.DoubleApartmentTest;
import Test.Hotel.Accommodation.Apartment.TripleApartmentTest;
import Test.Hotel.Accommodation.Apartment.SpecialPackages.Double.ApartmentMargaridaTest;
import Test.Hotel.Accommodation.Apartment.SpecialPackages.Double.HoneymoonApartmentTest;
import Test.Hotel.Accommodation.Chalet.DoubleChaletTest;
import Test.Hotel.Accommodation.Chalet.TripleChaletTest;
import Test.Hotel.Accommodation.Room.DoubleRoomTest;
import Test.Hotel.Accommodation.Room.SimpleRoomTest;

public class App {
    public static void main(String[] args) throws Exception {
        menu();
        choose();
    }

    public static void menu() {
        System.out.println("========= MENU =========");
        System.out.println("[1] - Quarto Simples");
        System.out.println("[2] - Quarto Duplo");
        System.out.println("[3] - Apartamento Duplo");
        System.out.println("[4] - Apartamento Duplo | Pacote: Lua te Mel");
        System.out.println("[5] - Apartamento Duplo | Pacote: Margarida");
        System.out.println("[6] - Apartamento Triplo");
        System.out.println("[7] - Chalé Duplo");
        System.out.println("[8] - Chalé Triplo");
    }

    public static void choose() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Escolha um número para testar:");
            int choice = sc.nextInt();
            System.out.println("\n================== ### ==================");
            switch (choice) {
                case 1:
                    SimpleRoomTest.test();
                    break;
                case 2:
                    DoubleRoomTest.test();
                    break;
                case 3:
                    DoubleApartmentTest.test();
                    break;
                case 4:
                    HoneymoonApartmentTest.test();
                    break;
                case 5:
                    ApartmentMargaridaTest.test();
                    break;
                case 6:
                    TripleApartmentTest.test();
                    break;
                case 7:
                    DoubleChaletTest.test();
                    break;
                case 8:
                    TripleChaletTest.test();
                    break;
                default:
                    System.out.println("Valor inválido");
                    menu();
            }
        }
    }

    public void clear() throws InterruptedException, IOException {
        if (System.getProperty("os.name").contains("Windows"))
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        else
            Runtime.getRuntime().exec("clear");
    }
}