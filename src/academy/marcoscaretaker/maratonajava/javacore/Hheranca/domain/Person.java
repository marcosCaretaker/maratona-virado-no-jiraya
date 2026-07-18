package academy.marcoscaretaker.maratonajava.javacore.Hheranca.domain;

public class Person {
    protected String name;
    protected String cpf;
    protected Address address;

    static {
        System.out.println("Bloco estático de inicialização de Person");
    }

     {
        System.out.println("Bloco de inicialização de Person 1");
    }

     {
        System.out.println("Bloco de inicialização de Person 2");
    }


    public Person(String name) {
        this.name = name;
        System.out.println("Dentro do construtor de Person");
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
