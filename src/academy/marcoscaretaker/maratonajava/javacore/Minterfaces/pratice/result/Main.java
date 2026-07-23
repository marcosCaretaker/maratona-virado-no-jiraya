package academy.marcoscaretaker.maratonajava.javacore.Minterfaces.pratice.result;

import academy.marcoscaretaker.maratonajava.javacore.Minterfaces.pratice.domain.Car;
import academy.marcoscaretaker.maratonajava.javacore.Minterfaces.pratice.domain.Motorcycle;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Motorcycle motorcycle1 = new Motorcycle();

        car1.startEngine();
        car1.accelerate(120);
        car1.stopEngine();

        motorcycle1.startEngine();
        motorcycle1.accelerate(44);
        motorcycle1.stopEngine();
    }
}
