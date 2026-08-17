package academy.marcoscaretaker.maratonajava.javacore.Hheranca.test;

import academy.marcoscaretaker.maratonajava.javacore.Hheranca.domain.Address;
import academy.marcoscaretaker.maratonajava.javacore.Hheranca.domain.Employee;
import academy.marcoscaretaker.maratonajava.javacore.Hheranca.domain.Person;

public class HerancaTest01 {
    public static void main(String[] args) {
        Address address = new Address();
        address.setStreet("Rua das cajamangas");
        address.setZipCode("33290-122");
        System.out.println("--- ---- Pessoa ---- ---");
        Person person = new Person("Yuji Itadori");
        person.setCpf("444.444.444-44");
        person.setAddress(address);
        person.print();
        System.out.println("--- ---- Funcionário agora existe ---- ---");
        Employee employee = new Employee("Tanjiro Kamado");
        employee.setCpf("000.000.000-00");
        Address address2 = new Address();
        address2.setStreet("Rua das goiabeiras");
        address2.setZipCode("11111-00");
        employee.setAddress(address2);
        employee.setSalary(77777);
        employee.print();
    }
}
