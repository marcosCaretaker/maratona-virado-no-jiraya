package academy.marcoscaretaker.maratonajava.javacore.Jmodificadofinal.test;

import academy.marcoscaretaker.maratonajava.javacore.Jmodificadofinal.domain.Car;
import academy.marcoscaretaker.maratonajava.javacore.Jmodificadofinal.domain.Skyline;

public class CarTest01 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setName("Vectra GLS");
        System.out.println(Car.getSpeedLimit());
        System.out.println(car.BUYER);
        car.BUYER.setName("Goku");
        System.out.println(car.BUYER);
        Skyline skyline = new Skyline();
        skyline.setName("R34");
        skyline.print();
    }
}
