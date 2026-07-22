package academy.marcoscaretaker.maratonajava.javacore.Lclassesabstratas.test;

import academy.marcoscaretaker.maratonajava.javacore.Lclassesabstratas.domain.Developer;
import academy.marcoscaretaker.maratonajava.javacore.Lclassesabstratas.domain.Employee;
import academy.marcoscaretaker.maratonajava.javacore.Lclassesabstratas.domain.Manager;

public class EmployeeTest01 {
    public static void main(String[] args) {
        Employee employee1 = new Developer("Zenitsu",2443);
        Manager manager1 = new Manager("Zendaya",3500);


        System.out.println(employee1);
        System.out.println(manager1);
        employee1.print();
        manager1.print();
    }
}
