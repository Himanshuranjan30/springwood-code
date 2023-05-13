package services;

import DBdao.DbDao;
import models.Movie;
import repositories.MovieRepository;

import java.util.List;

public class MovieService implements MovieRepository {

    private final DbDao dbDao;

    public MovieService(DbDao dbDao) {
        this.dbDao = dbDao;
    }


    @Override
    public Movie getMovie(Integer id) {
        return dbDao.getMovie(id);
    }

    @Override
    public Movie addMovie(Movie movie) {
        return dbDao.addMovie(movie);
    }

    @Override
    public List<Movie> getAllMovies() {
        return dbDao.getAllMovies();
    }
}
