package academy.marcoscaretaker.maratonajava.javacore.Kenum.domain;

public class Customer {
    private String name;
    private TypeCustomer typeCustomer;
    private PaymentType paymentType;

    public Customer(String name, TypeCustomer typeCustomer, PaymentType paymentType) {
        this.name = name;
        this.typeCustomer = typeCustomer;
        this.paymentType = paymentType;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", typeCustomer=" + typeCustomer.getPersonReport() +
                ", typeCustomerID=" + typeCustomer.getValue() +
                ", paymentType=" + paymentType +
                '}';
    }


}
