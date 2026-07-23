package academy.marcoscaretaker.maratonajava.javacore.Npolimorfismo.test;

import academy.marcoscaretaker.maratonajava.javacore.Npolimorfismo.domain.Computer;
import academy.marcoscaretaker.maratonajava.javacore.Npolimorfismo.domain.Product;
import academy.marcoscaretaker.maratonajava.javacore.Npolimorfismo.domain.Television;
import academy.marcoscaretaker.maratonajava.javacore.Npolimorfismo.domain.Tomato;
import academy.marcoscaretaker.maratonajava.javacore.Npolimorfismo.service.TaxCalculator;

public class ProductTest02 {
    public static void main(String[] args) {
        Product computer = new Computer("Ryzen 7",2100);
        Product tomato = new Tomato("Tomate salada",11);
        Product television = new Television("Xiaomi 40pol",1500);

        System.out.println(computer.getName());
        System.out.println(computer.getValue());
        TaxCalculator.calculateTax(computer);
        System.out.println("--- --- --- --- ---");
        System.out.println(tomato.getName());
        System.out.println(tomato.getValue());
        TaxCalculator.calculateTax(tomato);
        System.out.println("--- --- --- --- ---");
        System.out.println(television.getName());
        System.out.println(television.getValue());
        TaxCalculator.calculateTax(television);


    }
}
