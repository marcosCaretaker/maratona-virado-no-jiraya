package academy.marcoscaretaker.maratonajava.javacore.Ycollections.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> movies = new ArrayList<>();
        movies.add("Fast and Furious 5");
        movies.add("Pulp Fiction");
        movies.add("Interstellar");
        movies.add("Back to the Future 2");
        movies.add("Kill Bill");
        List<Double> values = new ArrayList<>();
        values.add(432.63);
        values.add(134.23);
        values.add(42.09);
        values.add(122.00);
        values.add(67.67);
        Collections.sort(movies);
        for(String movie : movies){
            System.out.println(movie);
        }
        System.out.println(values);
        Collections.sort(values);
        System.out.println(values);
    }
}
