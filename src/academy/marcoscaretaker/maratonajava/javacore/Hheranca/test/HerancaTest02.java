package academy.marcoscaretaker.maratonajava.javacore.Hheranca.test;


import academy.marcoscaretaker.maratonajava.javacore.Hheranca.domain.Employee;

public class HerancaTest02 {

    // 0 - The initialization block of the super class is executed when the JVM loads a class parent
    // 1 - The initialization block of the subclass is executed when the JVM loads a class son
    // 2 - Memory space allocated for the parent class object
    // 3 - Each class attribute is created and initialized with default values or whatever values are passed a class parent
    // 4 - The initialization block of the super class is executed in the order in which it appears
    // 5 - The builder super class is executed
    // 6 - Memory space allocated for the subclass object
    // 7 - Each class attribute is created and initialized with default values or whatever values are passed a subclass
    // 8 - The initialization block of the subclass is executed in the order in which it appears
    // 9 - The builder subclass is executed

    public static void main(String[] args){
        Employee employee = new Employee("Hashira");
    }
}
