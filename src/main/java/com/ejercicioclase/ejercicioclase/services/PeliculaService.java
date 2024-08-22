package com.ejercicioclase.ejercicioclase.services;

import java.util.List;
import java.util.Optional;

import com.ejercicioclase.ejercicioclase.domain.entities.Pelicula;

public interface PeliculaService {
    List<Pelicula> findAll();

    Optional<Pelicula> findById(Integer id);

    Pelicula save(Pelicula pelicula);

    Pelicula update(Long id);

    Optional<Pelicula> delete(Long id);
}
