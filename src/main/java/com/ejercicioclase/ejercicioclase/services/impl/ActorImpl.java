package com.ejercicioclase.ejercicioclase.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejercicioclase.ejercicioclase.domain.entities.Actor;
import com.ejercicioclase.ejercicioclase.domain.repository.ActorRepository;
import com.ejercicioclase.ejercicioclase.services.ActorService;

@Service
public class ActorImpl implements ActorService {
    @Autowired
    private ActorRepository actorRepository;

    @Override
    public List<Actor> findAll() {
        return (List<Actor>)actorRepository.findAll();
    }

    @Override
    public Optional<Actor> findById(Short id) {
        return actorRepository.findById(id);
    }

    @Override
    public Actor save(Actor actor) {
        return actorRepository.save(actor);
    }

    @Override
    public Actor update(Short id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
        
    }

    @Override
    public Optional<Actor> delete(Short id) {
        Optional<Actor> actorOptional = actorRepository.findById(id);
        actorOptional.ifPresent(actorItem ->{
            actorRepository.delete(actorItem);});
            return actorOptional;
        }
    }

    


