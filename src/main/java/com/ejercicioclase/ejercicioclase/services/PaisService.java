package com.ejercicioclase.ejercicioclase.services;
import java.util.List;
import java.util.Optional;

import com.ejercicioclase.ejercicioclase.domain.entities.Pais;

public interface PaisService {
     List<Pais> findAll();
Optional<Pais> findById(Integer id);
Pais save(Pais pais);
Pais update(Long id);
Optional<Pais> delete(Long id);

}
