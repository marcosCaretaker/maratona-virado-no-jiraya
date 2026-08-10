package academy.marcoscaretaker.maratonajava.javacore.Ycollections.test;

import academy.marcoscaretaker.maratonajava.javacore.Ycollections.domain.Movie;
import academy.marcoscaretaker.maratonajava.javacore.Ycollections.domain.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartphoneModelComparator implements Comparator<Smartphone>{
    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getModel().compareTo(o2.getModel());
    }
}
class MovieReviewComparator implements Comparator<Movie>{
    @Override
    public int compare(Movie o1, Movie o2) {
        return Double.compare(o1.getMovieReview(),o2.getMovieReview());
    }
}
public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneModelComparator());
        Smartphone smartphone = new Smartphone("981347", "Samsung", "Galaxy S24");
        set.add(smartphone);
        NavigableSet<Movie> movies = new TreeSet<>(new MovieReviewComparator());
        movies.add(new Movie(5L, "Fast and Furious 5", 2011, 7.3));
        movies.add(new Movie(2L, "Pulp Fiction", 1994, 8.8));
        movies.add(new Movie(4L, "Interstellar", 2014, 8.7));
        movies.add(new Movie(1L, "Back to the Future 2", 1989, 7.8));
        movies.add(new Movie(3L, "Kill Bill vol.1", 2003, 8.2));
        movies.add(new Movie(7L, "The Shawshank Redemption", 1994, 9.3));
        for (Movie movie : movies) {
            System.out.println(movie);
        }
        Movie fightClub = new Movie(9L, "The Dark Knight    ", 2008, 9.0);
        // lower(e) < Returns de greatest element strictly less than e
        // floor(e) <= Returns the greatest element less than or equal to e
        // higher(e) > Returns the least element strictly greater than e
        // ceiling(e) >= Returns the least element greater than or equal to e
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println("lower: "+movies.lower(fightClub));
        System.out.println("floor: "+movies.floor(fightClub));
        System.out.println("higher: "+movies.higher(fightClub));
        System.out.println("ceiling: "+movies.ceiling(fightClub));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println(movies.size());
        System.out.println(movies.pollFirst());
        System.out.println(movies.size());
    }
}
