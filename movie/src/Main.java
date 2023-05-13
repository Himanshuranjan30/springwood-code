import DBdao.DbDao;
import models.Actor;
import models.Movie;
import services.ActorService;
import services.MovieService;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        DbDao dbDao = new DbDao();
        ActorService actorService = new ActorService(dbDao);
        MovieService movieService = new MovieService(dbDao);

        //create actors
        Actor actor1 = new Actor("Himanshu",20,"test1","test1.com");
        Actor actor2 = new Actor("Pranav",23,"test2","test2.com");
        Actor actor3 = new Actor("Mayank",20,"test3","test3.com");

        actorService.addActor(actor1);
        actorService.addActor(actor2);
        actorService.addActor(actor3);

        // create movies
        Movie movie1 = new Movie("Movie1","Director1",4.5f,
                LocalDate.now().minusDays(12), Arrays.asList(actor1,actor2));

        Movie movie2 = new Movie("Movie2","Director2",8.5f,
                LocalDate.now().minusDays(10), Arrays.asList(actor1,actor3));

        Movie movie3 = new Movie("Movie3","Director3",9.5f,
                LocalDate.now().plusDays(12), Arrays.asList(actor3,actor2));

        movieService.addMovie(movie1);
        movieService.addMovie(movie2);
        movieService.addMovie(movie3);

        // let see the results
        System.out.println(movieService.getAllMovies());
        System.out.println(actorService.getAllActors());

    }
}