package academy.marcoscaretaker.maratonajava.javacore.Zgenerics.test;

import academy.marcoscaretaker.maratonajava.javacore.Zgenerics.domain.Boat;
import academy.marcoscaretaker.maratonajava.javacore.Zgenerics.service.BoatRentalService;

public class GenericClassesTest02 {
    public static void main(String[] args) {
        BoatRentalService boatRentalService = new BoatRentalService();
        Boat boat = boatRentalService.retrieveAvailableBoat();
        System.out.println("Using the car for an entire month");
        boatRentalService.returnRentBoat(boat);
    }
}
