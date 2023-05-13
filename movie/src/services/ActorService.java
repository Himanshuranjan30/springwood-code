package services;

import DBdao.DbDao;
import models.Actor;
import repositories.ActorRepository;

import java.util.List;

public class ActorService implements ActorRepository {

    private final DbDao dbDao;

    public ActorService(DbDao dbDao) {
        this.dbDao = dbDao;
    }
    @Override
    public Actor getActor(Integer id) {
        return dbDao.getActorById(id);
    }

    @Override
    public Actor addActor(Actor actor) {
        return dbDao.addActor(actor);
    }

    @Override
    public List<Actor> getAllActors() {
        return dbDao.getAllActors();
    }
}
