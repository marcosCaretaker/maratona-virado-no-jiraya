package academy.marcoscaretaker.maratonajava.javacore.Zgenerics.service;

import academy.marcoscaretaker.maratonajava.javacore.Zgenerics.domain.Boat;

import java.util.ArrayList;
import java.util.List;

public class BoatRentalService {
    List<Boat> boatsAvailable = new ArrayList<>(List.of(new Boat("Azimut"),new Boat("Fountaine")));

    public Boat retrieveAvailableBoat(){
        System.out.println("Searching for any boat available");
        Boat boat = boatsAvailable.remove(0);
        System.out.println("Renting the boat: "+boat);
        System.out.println("Available boats to rent: "+boatsAvailable);
        return boat;
    }

    public void returnRentBoat(Boat boat){
        System.out.println("Returning boat: "+boat);
        boatsAvailable.add(boat);
        System.out.println("Available boats to rent: "+boatsAvailable);
    }

}
