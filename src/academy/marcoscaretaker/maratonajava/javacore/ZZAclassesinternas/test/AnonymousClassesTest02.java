package academy.marcoscaretaker.maratonajava.javacore.ZZAclassesinternas.test;

import academy.marcoscaretaker.maratonajava.javacore.Zgenerics.domain.Boat;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AnonymousClassesTest02 {
    public static void main(String[] args) {
        List<Boat> boatList = new ArrayList<>(List.of(new Boat("sailboat"), new Boat("motorboat")));
        System.out.println(boatList);
        boatList.sort(new Comparator<Boat>() {
            @Override
            public int compare(Boat o1, Boat o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println(boatList);
    }
}
