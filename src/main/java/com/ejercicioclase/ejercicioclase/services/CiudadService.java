package com.ejercicioclase.ejercicioclase.services;

import java.util.List;
import java.util.Optional;

import com.ejercicioclase.ejercicioclase.domain.entities.Ciudad;

public interface CiudadService {
      List<Ciudad> findAll();

      Optional<Ciudad> findById(Short id);

      Ciudad save(Ciudad ciudad);

      Ciudad update(Long id);

      Optional<Ciudad> delete(Long id);

}
