package academy.marcoscaretaker.maratonajava.javacore.Fstaticmodifier.test;

import academy.marcoscaretaker.maratonajava.javacore.Fstaticmodifier.domain.Car;

public class CarTest01 {
    public static void main(String[] args) {
        Car car = new Car("Porsche",178);
        Car car2 = new Car("Skyline",190);
        Car car3 = new Car("Kombi",85);
        System.out.println("Speed limit: "+Car.getSpeedLimit());
        car.print();
        car2.print();
        car3.print();
    }
}
