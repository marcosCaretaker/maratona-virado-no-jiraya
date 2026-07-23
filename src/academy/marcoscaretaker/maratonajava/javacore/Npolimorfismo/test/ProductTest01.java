package academy.marcoscaretaker.maratonajava.javacore.Npolimorfismo.test;

import academy.marcoscaretaker.maratonajava.javacore.Npolimorfismo.domain.Computer;
import academy.marcoscaretaker.maratonajava.javacore.Npolimorfismo.domain.Tomato;
import academy.marcoscaretaker.maratonajava.javacore.Npolimorfismo.service.TaxCalculator;

public class ProductTest01 {
    public static void main(String[] args) {
        Computer computer = new Computer("Ryzen 5500",560);
        Tomato tomato = new Tomato("Tomate Santa Cruz",14);

        TaxCalculator.calculateTaxComputer(computer);
        System.out.println("--- --- --- --- ---");
        TaxCalculator.calculateTaxTomato(tomato);
    }
}
