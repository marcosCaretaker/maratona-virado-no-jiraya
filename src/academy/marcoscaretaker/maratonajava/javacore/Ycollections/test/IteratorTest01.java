package academy.marcoscaretaker.maratonajava.javacore.Ycollections.test;

import academy.marcoscaretaker.maratonajava.javacore.Ycollections.domain.Movie;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        double movieReviewCut = 8;
        List<Movie> movies = new LinkedList<>();
        movies.add(new Movie(5L, "Fast and Furious 5", 2011, 7.3));
        movies.add(new Movie(2L, "Pulp Fiction", 1994, 8.8));
        movies.add(new Movie(4L, "Interstellar", 2014, 8.7));
        movies.add(new Movie(1L, "Back to the Future 2", 1989, 7.8));
        movies.add(new Movie(3L, "Kill Bill vol.1", 2003, 8.2));

//        Iterator<Movie> movieIterator = movies.iterator();
//        while (movieIterator.hasNext()) {
//            Movie movie = movieIterator.next();
//            if (movie.getMovieReview() <= movieReviewCut) {
//                movieIterator.remove();
//            }
//        }

        movies.removeIf(movie -> movie.getMovieReview() <= movieReviewCut);

        System.out.println(movies);
    }
}
