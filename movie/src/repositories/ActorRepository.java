package repositories;

import models.Actor;

import java.util.List;

public interface ActorRepository {

     Actor getActor(Integer id);

     Actor addActor(Actor actor);

     List<Actor> getAllActors();
}
