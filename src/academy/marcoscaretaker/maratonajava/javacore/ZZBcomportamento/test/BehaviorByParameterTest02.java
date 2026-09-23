package academy.marcoscaretaker.maratonajava.javacore.ZZBcomportamento.test;

import academy.marcoscaretaker.maratonajava.javacore.ZZBcomportamento.domain.Guitar;
import academy.marcoscaretaker.maratonajava.javacore.ZZBcomportamento.interfaces.GuitarPredicate;

import java.util.ArrayList;
import java.util.List;

public class BehaviorByParameterTest02 {

    private static List<Guitar> guitars = List.of(new Guitar("sunburst",1954), new Guitar("olympic white",1962), new Guitar("fiesta red",1965), new Guitar("black",1979), new Guitar("daphne blue",1986));

    public static void main(String[] args) {
        List<Guitar> blackGuitars = filter(guitars,guitar -> guitar.getColor().equals("black"));
        List<Guitar> beforeYearGuitar = filter(guitars,guitar -> guitar.getYearOfManufacture() < 1970);
        System.out.println(blackGuitars);
        System.out.println(beforeYearGuitar);
    }
    private static List<Guitar> filter(List<Guitar> guitars, GuitarPredicate guitarPredicate){
        List<Guitar> filteredGuitar = new ArrayList<>();
        for (Guitar guitar : guitars) {
            if (guitarPredicate.test(guitar)){
                filteredGuitar.add(guitar);
            }
        }
        return filteredGuitar;
    }
}
