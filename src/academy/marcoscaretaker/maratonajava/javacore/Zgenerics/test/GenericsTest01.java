package academy.marcoscaretaker.maratonajava.javacore.Zgenerics.test;

import academy.marcoscaretaker.maratonajava.javacore.Ycollections.domain.Consumer;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest01 {
    public static void main(String[] args) {
        // Type erasure
        List<String> cars = new ArrayList<>();
        cars.add("Skyline R34");
        cars.add("Civic Turbo");
        for (String car : cars) {
            System.out.println("Car name: "+car);
        }
        System.out.println("_-__-_ _-__-_ _-__-_");
        add(cars,new Consumer("Brian"));
        for (String car : cars) {
            System.out.println("Car name: "+car);
        }


    }
    private static void add(List list, Consumer consumer){
        list.add(consumer);
    }
}
