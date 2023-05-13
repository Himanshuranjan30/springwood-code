package utils;

public class Utils {

    private static Integer movieId = 1;

    private static Integer actorId = 1;

    public  static Integer getMovieId(){
        return movieId++;
    }

    public  static  Integer getActorId(){
        return actorId++;
    }
}
