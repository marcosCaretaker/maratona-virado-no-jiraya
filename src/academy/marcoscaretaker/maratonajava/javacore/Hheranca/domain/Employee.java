package academy.marcoscaretaker.maratonajava.javacore.Hheranca.domain;

public class Employee extends Person{
    private double salary;

    static {
        System.out.println("Bloco estático de inicialização de Employee");
    }

    {
        System.out.println("Bloco de inicialização de Employee 1");
    }

    {
        System.out.println("Bloco de inicialização de Employee 2");
    }

    public Employee(String name){
        super(name);
        System.out.println("Dentro do construtor de Employee");
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Salary:R$"+this.salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
