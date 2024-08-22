package com.ejercicioclase.ejercicioclase.services;

import java.util.List;
import java.util.Optional;


import com.ejercicioclase.ejercicioclase.domain.entities.Almacen;

public interface AlmacenService {
    List<Almacen> findAll();
    Optional<Almacen> findById(Long id);
    Almacen save(Almacen Almacen);
    Almacen update(Long id);
    Optional<Almacen> delete(Long id);

}
