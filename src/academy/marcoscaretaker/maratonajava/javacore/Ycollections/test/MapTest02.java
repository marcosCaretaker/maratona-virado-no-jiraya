package academy.marcoscaretaker.maratonajava.javacore.Ycollections.test;

import academy.marcoscaretaker.maratonajava.javacore.Ycollections.domain.Consumer;
import academy.marcoscaretaker.maratonajava.javacore.Ycollections.domain.Movie;

import java.util.HashMap;
import java.util.Map;

// two consumers
public class MapTest02 {
    public static void main(String[] args) {
        Consumer consumer1 = new Consumer("Fernando");
        Consumer consumer2 = new Consumer("Patrícia");

        Movie movie1 = new Movie(5L, "Fast and Furious 5", 2011);
        Movie movie2 = new Movie(2L,"Pulp Fiction",1994);
        Movie movie3 = new Movie(4L,"Interstellar",2014);
        Movie movie4 = new Movie(1L,"Back to the Future 2",1989);
        Map<Consumer,Movie> consumerMovie = new HashMap<>();
        consumerMovie.put(consumer1,movie2);
        consumerMovie.put(consumer2,movie4);
        System.out.println("Client and film:");
        for (Map.Entry<Consumer, Movie> entry : consumerMovie.entrySet()) {
            System.out.println(entry.getKey().getName()+" - "+entry.getValue().getName()+" ["+entry.getValue().getYearOfRelease()+"]");
        }

    }
}
