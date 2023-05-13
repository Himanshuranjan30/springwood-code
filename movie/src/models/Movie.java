package models;

import utils.Utils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class Movie {

    private Integer id;


    private String name;


    private String director;


    private Float rating;

    LocalDate releaseDate;

    List<Actor> actorList;


    public Movie(String name, String director, Float rating, LocalDate releaseDate, List<Actor> actorList) {
        this.id = Utils.getMovieId();
        this.name = name;
        this.director = director;
        this.rating = rating;
        this.releaseDate = releaseDate;
        this.actorList = actorList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Float getRating() {
        return rating;
    }

    public void setRating(Float rating) {
        this.rating = rating;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public List<Actor> getActorList() {
        return actorList;
    }

    public void setActorList(List<Actor> actorList) {
        this.actorList = actorList;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", director='" + director + '\'' +
                ", rating=" + rating +
                ", releaseDate=" + releaseDate +
                ", actorList=" + actorList +
                '}';
    }
}
