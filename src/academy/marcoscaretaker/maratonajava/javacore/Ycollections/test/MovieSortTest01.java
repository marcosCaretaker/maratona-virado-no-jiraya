package academy.marcoscaretaker.maratonajava.javacore.Ycollections.test;

import academy.marcoscaretaker.maratonajava.javacore.Ycollections.domain.Movie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MovieByIdComparator implements Comparator<Movie>{
    @Override
    public int compare(Movie movie1, Movie movie2) {
        return movie1.getId().compareTo(movie2.getId());
    }
}

public class MovieSortTest01 {
    public static void main(String[] args) {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie(5L,"Fast and Furious 5",2011));
        movies.add(new Movie(2L,"Pulp Fiction",1994));
        movies.add(new Movie(4L,"Interstellar",2014));
        movies.add(new Movie(1L,"Back to the Future 2",1989));
        movies.add(new Movie(3L,"Kill Bill vol.1",2003));
        for (Movie movie : movies) {
            System.out.println(movie);
        }
        System.out.println("§§§§§§§§§§");
        Collections.sort(movies);
        for (Movie movie : movies) {
            System.out.println(movie);
        }

        System.out.println("§§§§§§§§§§");
        Collections.sort(movies, new MovieByIdComparator());
        for (Movie movie : movies) {
            System.out.println(movie);
        }



    }
}
