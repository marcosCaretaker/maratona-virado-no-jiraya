package academy.marcoscaretaker.maratonajava.javacore.Ycollections.test;

import academy.marcoscaretaker.maratonajava.javacore.Ycollections.domain.Consumer;
import academy.marcoscaretaker.maratonajava.javacore.Ycollections.domain.Movie;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

// two consumers
public class MapTest03 {
    public static void main(String[] args) {
        Consumer consumer1 = new Consumer("Fernando");
        Consumer consumer2 = new Consumer("Patrícia");
        Consumer consumer3 = new Consumer("Matias");

        Movie movie1 = new Movie(5L, "Fast and Furious 5", 2011);
        Movie movie2 = new Movie(2L,"Pulp Fiction",1994);
        Movie movie3 = new Movie(4L,"Interstellar",2014);
        Movie movie4 = new Movie(1L,"Back to the Future 2",1989);
        Movie movie5 = new Movie(1L,"Inside out 2",2024);
        Movie movie6 = new Movie(1L,"Spider-Man:Across the Spider-Verse",2023);
        List<Movie> consumer1ListMovie = List.of(movie1,movie3);
        List<Movie> consumer2ListMovie = List.of(movie2,movie3,movie4);
        List<Movie> consumer3ListMovie = List.of(movie5,movie6);
        Map<Consumer, List<Movie>> consumerMovie = new HashMap<>();
        consumerMovie.put(consumer1,consumer1ListMovie);
        consumerMovie.put(consumer2,consumer2ListMovie);
        consumerMovie.put(consumer3,consumer3ListMovie);
        for(Map.Entry<Consumer,List<Movie>> entry : consumerMovie.entrySet()){
            System.out.println("- "+entry.getKey().getName());
            for(Movie movie : entry.getValue()){
                System.out.println("-- "+movie.getName());
            }
            System.out.println("          ---");
        }
    }
}
