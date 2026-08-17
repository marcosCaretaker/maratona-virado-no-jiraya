package academy.marcoscaretaker.maratonajava.javacore.Zgenerics.test;

import academy.marcoscaretaker.maratonajava.javacore.Zgenerics.domain.Boat;
import academy.marcoscaretaker.maratonajava.javacore.Zgenerics.domain.Car;
import academy.marcoscaretaker.maratonajava.javacore.Zgenerics.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class GenericClassesTest03 {
    public static void main(String[] args) {
        List<Boat> boatsAvailable = new ArrayList<>(List.of(new Boat("Azimut"),new Boat("Fountaine")));
        List<Car> carsAvailable = new ArrayList<>(List.of(new Car("Tesla"),new Car("BYD")));
        RentalService<Car> rentalServiceCar = new RentalService<>(carsAvailable);
        Car car = rentalServiceCar.retrieveAvailableObject();
        System.out.println("Using car for a month");
        rentalServiceCar.returnRentObject(car);
        System.out.println("----------");
        RentalService<Boat> rentalServiceBoat = new RentalService<>(boatsAvailable);
        Boat boat = rentalServiceBoat.retrieveAvailableObject();
        System.out.println("Using boat for a month");
        rentalServiceBoat.returnRentObject(boat);
    }
}
