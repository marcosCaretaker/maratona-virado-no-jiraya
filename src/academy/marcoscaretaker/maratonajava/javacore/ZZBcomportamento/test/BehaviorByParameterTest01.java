package academy.marcoscaretaker.maratonajava.javacore.ZZBcomportamento.test;

import academy.marcoscaretaker.maratonajava.javacore.ZZBcomportamento.domain.Guitar;

import java.util.ArrayList;
import java.util.List;

public class BehaviorByParameterTest01 {

    private static List<Guitar> guitars = List.of(new Guitar("sunburst",1954), new Guitar("olympic white",1962), new Guitar("fiesta red",1965), new Guitar("black",1979), new Guitar("daphne blue",1986));

    public static void main(String[] args) {
        System.out.println("filter by black color:");
        System.out.println(filterBlackGuitar(guitars));
        System.out.println("filter by sunburst color:");
        System.out.println(filterSunburstGuitar(guitars));
        System.out.println("filter by chosen color:");
        System.out.println(filterGuitarByColor(guitars,"daphne blue"));
        System.out.println("filter by year before:");
        System.out.println(filterByYearBefore(guitars,1970));
        // The headache William puts us through, lol.z
    }
    private static List<Guitar> filterBlackGuitar(List<Guitar> guitars){
        List<Guitar> filteredGuitar = new ArrayList<>();
        for (Guitar guitar : guitars) {
            if (guitar.getColor().equals("black")){
                filteredGuitar.add(guitar);
            }
        }
        return filteredGuitar;
    }

    private static List<Guitar> filterSunburstGuitar(List<Guitar> guitars){
        List<Guitar> filteredGuitar = new ArrayList<>();
        for (Guitar guitar : guitars) {
            if (guitar.getColor().equals("sunburst")){
                filteredGuitar.add(guitar);
            }
        }
        return filteredGuitar;
    }

    private static List<Guitar> filterGuitarByColor(List<Guitar> guitars,String color){
        List<Guitar> filteredGuitar = new ArrayList<>();
        for (Guitar guitar : guitars) {
            if (guitar.getColor().equals(color)){
                filteredGuitar.add(guitar);
            }
        }
        return filteredGuitar;
    }

    private static List<Guitar> filterByYearBefore(List<Guitar> guitars,int year){
        List<Guitar> filteredGuitar = new ArrayList<>();
        for (Guitar guitar : guitars) {
            if (guitar.getYearOfManufacture() < year){
                filteredGuitar.add(guitar);
            }
        }
        return filteredGuitar;
    }

}
