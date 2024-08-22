package com.ejercicioclase.ejercicioclase.services.impl;



import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ejercicioclase.ejercicioclase.domain.entities.Pelicula;
import com.ejercicioclase.ejercicioclase.domain.repository.PeliculaRepository;
import com.ejercicioclase.ejercicioclase.services.PeliculaService;


@Service
public class PeliculaImpl implements PeliculaService {

    @Autowired
    private PeliculaRepository peliculaRepository;

    @Transactional
    @Override
    public List<Pelicula> findAll() {
        return (List<Pelicula>) peliculaRepository.findAll();
    }

    @Transactional
    @Override
    public Optional<Pelicula> findById(Long id) {
        return peliculaRepository.findById(id);
    }

    @Transactional
    @Override
    public Pelicula save(Pelicula pelicula) {
        return peliculaRepository.save(pelicula);
    }

    @Transactional
    @Override
    public Pelicula update(Long id) {
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Transactional
    @Override
    public Optional<Pelicula> delete(Long id) {
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }
}

