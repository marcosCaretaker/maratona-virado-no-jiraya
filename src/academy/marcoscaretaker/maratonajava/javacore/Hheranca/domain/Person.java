package academy.marcoscaretaker.maratonajava.javacore.Hheranca.domain;

public class Person {
    protected String name;
    protected String cpf;
    protected Address address;

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, String cpf) {
        this(name);
        this.cpf = cpf;
    }

    public void print(){
        System.out.println("Name: "+this.name);
        System.out.println("Cpf: "+this.cpf);
        System.out.println("Address: "+this.address.getStreet()+" CEP: "+this.address.getZipCode()+".");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
