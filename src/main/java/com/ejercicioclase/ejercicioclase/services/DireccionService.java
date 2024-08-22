package com.ejercicioclase.ejercicioclase.services;

import java.util.List;
import java.util.Optional;

import com.ejercicioclase.ejercicioclase.domain.entities.Direccion;

public interface DireccionService {
    List<Direccion> findAll();

    Optional<Direccion> findById(short id);

    Direccion save(Direccion direccion);

    Direccion update(Long id);

    Optional<Direccion> delete(Long id);
}
