package academy.marcoscaretaker.maratonajava.javacore.Npolimorfismo.test;

import academy.marcoscaretaker.maratonajava.javacore.Npolimorfismo.domain.Computer;
import academy.marcoscaretaker.maratonajava.javacore.Npolimorfismo.domain.Product;
import academy.marcoscaretaker.maratonajava.javacore.Npolimorfismo.domain.Tomato;
import academy.marcoscaretaker.maratonajava.javacore.Npolimorfismo.service.TaxCalculator;

public class ProductTest03 {
    public static void main(String[] args) {
        Product computer = new Computer("Ryzen 7",2100);
        Tomato tomato = new Tomato("Tomate salada",11);
        tomato.setExpirationDate("31/09/2026");
        TaxCalculator.calculateTax(tomato);
        System.out.println("--- ---- ---");
        TaxCalculator.calculateTax(computer);
    }
}
