package academy.marcoscaretaker.maratonajava.javacore.Npolimorfismo.service;

import academy.marcoscaretaker.maratonajava.javacore.Npolimorfismo.domain.Computer;
import academy.marcoscaretaker.maratonajava.javacore.Npolimorfismo.domain.Tomato;

public class TaxCalculator {
    public static void calculateTaxComputer(Computer computer){
        System.out.println("Computer Tax Report");
        double tax = computer.calculateTax();
        System.out.println("Computer "+computer.getName());
        System.out.println("Value "+computer.getValue());
        System.out.println("Tax Due "+tax);
    }

    public static void calculateTaxTomato(Tomato tomato){
        System.out.println("Computer Tax Report");
        double tax = tomato.calculateTax();
        System.out.println("Tomato "+tomato.getName());
        System.out.println("Value "+tomato.getValue());
        System.out.println("Tax Due "+tax);
    }

}
