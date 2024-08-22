package com.ejercicioclase.ejercicioclase.services;

import java.util.List;
import java.util.Optional;

import com.ejercicioclase.ejercicioclase.domain.entities.Inventario;

public interface InventarioService {
    List<Inventario> findAll();

    Optional<Inventario> findById(Long id);

    Inventario save(Inventario inventario);

    Inventario update(Long id);

    Optional<Inventario> delete(Long id);
}
