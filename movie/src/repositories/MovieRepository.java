package repositories;

import models.Movie;

import java.util.List;

public interface MovieRepository {

    public Movie getMovie(Integer id);

    public Movie addMovie(Movie movie);

    public List<Movie> getAllMovies();
}
