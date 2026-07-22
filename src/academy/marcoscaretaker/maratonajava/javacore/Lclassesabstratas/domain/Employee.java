package academy.marcoscaretaker.maratonajava.javacore.Lclassesabstratas.domain;

public abstract class Employee extends Person {
    protected String name;
    protected  double salary;
    protected float bonus;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        calculateBonus();
    }

    @Override
    public void print() {
        System.out.println("Imprimindoo...");
    }

    public abstract void calculateBonus();


}
