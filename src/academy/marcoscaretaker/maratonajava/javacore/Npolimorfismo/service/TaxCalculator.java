package academy.marcoscaretaker.maratonajava.javacore.Npolimorfismo.service;

import academy.marcoscaretaker.maratonajava.javacore.Npolimorfismo.domain.Product;

public class TaxCalculator {

    public static void calculateTax(Product product){
        System.out.println("Tax report");
        double tax = product.calculateTax();
        System.out.println("Product: "+product.getName());
        System.out.println("Value: "+product.getValue());
        System.out.println("Tax due: "+tax);
    }

}
