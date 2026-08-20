package academy.marcoscaretaker.maratonajava.javacore.ZZAinnerclasses.test;

import academy.marcoscaretaker.maratonajava.javacore.Zgenerics.domain.Car;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class CarTitleComparator implements Comparator<Car>{
    @Override
    public int compare(Car o1, Car o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

public class AnonymousClassesTest02 {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>(List.of(new Car("Logus"),new Car("Vectra"), new Car("Audi"),new Car("Ferrari")));
        System.out.println(cars);
        cars.sort(new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println("After drawing by name: ");
        System.out.println(cars);
    }
}
