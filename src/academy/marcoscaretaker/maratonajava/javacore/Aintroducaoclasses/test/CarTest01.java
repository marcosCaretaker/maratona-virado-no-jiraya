package academy.marcoscaretaker.maratonajava.javacore.Aintroducaoclasses.test;

import academy.marcoscaretaker.maratonajava.javacore.Aintroducaoclasses.domain.Car;

public class CarTest01 {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        car1.name = "R34";
        car1.year = 1999;
        car1.model = "Nissan";
        car1.velMax = 197.3f;

        car2.name = "Uno";
        car2.year = 1988;
        car2.model = "Fiat";
        car2.velMax = 103.4f;
        car1 = car2;
        System.out.println("Car 1: ");
        System.out.println("name of car: "+car1.name+" year of manufacture: "+car1.year+" model: "+car1.model+" velocity max: "+car1.velMax+"Kmh.");
        System.out.println("Car 2: ");
        System.out.println("name of car: "+car2.name+" year of manufacture: "+car2.year+" model: "+car2.model+" velocity max: "+car2.velMax+"Kmh.");
    }
}
