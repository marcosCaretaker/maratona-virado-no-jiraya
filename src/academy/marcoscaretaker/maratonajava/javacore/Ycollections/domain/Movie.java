package academy.marcoscaretaker.maratonajava.javacore.Ycollections.domain;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class Movie implements Comparable<Movie>{
    private Long id;
    private String name;
    private int yearOfRelease;
    private double movieReview;

    public Movie(Long id, String name, int releaseDate) {
        Objects.requireNonNull(id);
        Objects.requireNonNull(name);
        this.id = id;
        this.name = name;
        this.yearOfRelease = releaseDate;
    }

    public Movie(Long id, String name, int yearOfRelease, double movieReview) {
        this(id,name,yearOfRelease);
        this.movieReview = movieReview;
    }

    @Override
    public String toString() {
        return this.name+" released in "+yearOfRelease+" score review: "+this.movieReview;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return Double.compare(yearOfRelease, movie.yearOfRelease) == 0 && Objects.equals(id, movie.id) && Objects.equals(name, movie.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, yearOfRelease);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public double getMovieReview() {
        return movieReview;
    }

    public void setMovieReview(double movieReview) {
        this.movieReview = movieReview;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    @Override
    public int compareTo(@NotNull Movie anotherMovie) {
        // negative if this < anotherMovie
        // if this == anotherMovie, return 0
        // positive if this > anotherMovie
        // if(this.id < anotherMovie.getId()){
        //    return -1;
        //}else if(this.id.equals(anotherMovie.getId())){
        //    return 0;
        //}else{
        //   return 1;
        //}
//        return this.id.compareTo(anotherMovie.getId());
//        return Double.valueOf(this.yearOfRelease).compareTo(anotherMovie.getYearOfRelease());
          return Double.compare(this.yearOfRelease, anotherMovie.getYearOfRelease());
    }
}
