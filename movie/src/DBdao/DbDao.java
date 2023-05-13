package DBdao;

import models.Actor;
import models.Movie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DbDao {

    Map<Integer, Movie> movieMap;

    Map<Integer, Actor> actorMap;


    public DbDao() {
        this.movieMap = new HashMap<>();
        this.actorMap = new HashMap<>();
    }

    public List<Movie> getAllMovies(){
        List<Movie> movieList = new ArrayList<>();
        movieMap.forEach((id,value)->{
            movieList.add(value);
        });
        return movieList;
    }

    public Movie getMovie(Integer id){
        return movieMap.get(id);
    }

    public Movie addMovie(Movie movie){
        movieMap.put(movie.getId(),movie);
        return movie;
    }

    public Actor addActor(Actor actor){
        actorMap.put(actor.getId(),actor);
        return actor;
    }

    public Actor getActorById(Integer id){
        return actorMap.get(id);
    }

    public List<Actor> getAllActors(){
       List<Actor> actors = new ArrayList<>();
       actorMap.forEach((id,value)->{
           actors.add(value);
       });
       return actors;
    }
}
