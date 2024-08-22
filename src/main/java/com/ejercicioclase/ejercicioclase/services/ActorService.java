package com.ejercicioclase.ejercicioclase.services;

import java.util.List;
import java.util.Optional;

import com.ejercicioclase.ejercicioclase.domain.entities.Actor;

public interface ActorService {
    List<Actor> findAll();
    Optional <Actor> findById(Short id);
    Actor save(Actor actor);
    Actor update(Short id);
    Optional<Actor>delete(Short id);

}
