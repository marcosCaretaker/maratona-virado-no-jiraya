package academy.marcoscaretaker.maratonajava.javacore.Kenum.test;

import academy.marcoscaretaker.maratonajava.javacore.Kenum.domain.Customer;
import academy.marcoscaretaker.maratonajava.javacore.Kenum.domain.PaymentType;
import academy.marcoscaretaker.maratonajava.javacore.Kenum.domain.TypeCustomer;

public class CustomerTest01 {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Dominic Toretto",TypeCustomer.INDIVIDUAL, PaymentType.PIX);
        Customer customer2 = new Customer("Paul Walker", TypeCustomer.CORPORATE, PaymentType.DEBT);

        System.out.println("Customer 1: "+customer1.toString());
        System.out.println("Customer 2: "+customer2.toString());

        System.out.println(PaymentType.PIX.calculateDiscount(100));
        TypeCustomer individual = TypeCustomer.valueOf("INDIVIDUAL");
        System.out.println(individual.getPersonReport());
        TypeCustomer corporate = TypeCustomer.typeCustomerForPersonReport("Corporate");
        System.out.println(corporate);

    }
}
