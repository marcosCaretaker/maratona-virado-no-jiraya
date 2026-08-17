package academy.marcoscaretaker.maratonajava.javacore.Zgenerics.test;

import academy.marcoscaretaker.maratonajava.javacore.Zgenerics.domain.Car;
import academy.marcoscaretaker.maratonajava.javacore.Zgenerics.service.CarRentalService;

public class GenericClassesTest01 {
    public static void main(String[] args) {
        CarRentalService carRentalService = new CarRentalService();
        Car car = carRentalService.retrieveAvailableCar();
        System.out.println("Using the car for an entire month");
        carRentalService.returnRentCar(car);
    }
}
