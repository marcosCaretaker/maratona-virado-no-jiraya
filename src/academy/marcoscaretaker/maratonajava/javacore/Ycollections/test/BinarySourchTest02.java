package academy.marcoscaretaker.maratonajava.javacore.Ycollections.test;

import academy.marcoscaretaker.maratonajava.javacore.Ycollections.domain.Movie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySourchTest02 {
    public static void main(String[] args) {
        MovieByIdComparator movieByIdComparator = new MovieByIdComparator();
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie(5L,"Fast and Furious 5",2011));
        movies.add(new Movie(2L,"Pulp Fiction",1994));
        movies.add(new Movie(4L,"Interstellar",2014));
        movies.add(new Movie(1L,"Back to the Future 2",1989));
        movies.add(new Movie(3L,"Kill Bill vol.1",2003));
        movies.sort(movieByIdComparator);
        for (Movie movie : movies) {
            System.out.println(movie);
        }

        Movie movieToSearch = new Movie(3L, "Kill Bill vol.1", 2003);
        System.out.println(Collections.binarySearch(movies,movieToSearch,movieByIdComparator));

    }
}
