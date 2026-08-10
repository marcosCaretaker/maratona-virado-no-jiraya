package academy.marcoscaretaker.maratonajava.javacore.Ycollections.test;

import academy.marcoscaretaker.maratonajava.javacore.Ycollections.domain.Movie;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest02 {
    public static void main(String[] args) {
        Queue<Movie> movies = new PriorityQueue<>(new MovieReviewComparator().reversed());
        movies.add(new Movie(5L, "Fast and Furious 5", 2011, 7.3));
        movies.add(new Movie(2L, "Pulp Fiction", 1994, 8.8));
        movies.add(new Movie(4L, "Interstellar", 2014, 8.7));
        movies.add(new Movie(1L, "Back to the Future 2", 1989, 7.8));
        movies.add(new Movie(3L, "Kill Bill vol.1", 2003, 8.2));
        movies.add(new Movie(7L, "The Shawshank Redemption", 1994, 9.3));

        while(!movies.isEmpty()){
            System.out.println(movies.poll());
        }
    }
}
