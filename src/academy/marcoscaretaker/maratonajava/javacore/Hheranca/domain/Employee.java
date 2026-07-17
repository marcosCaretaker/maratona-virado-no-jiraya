package academy.marcoscaretaker.maratonajava.javacore.Hheranca.domain;

public class Employee extends Person{
    private double salary;

    public Employee(String name){
        super(name);
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
