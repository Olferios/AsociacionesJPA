package com.ejercicioclase.ejercicioclase.services;

import java.util.List;
import java.util.Optional;

import com.ejercicioclase.ejercicioclase.domain.entities.Categoria;


public interface CategoriaService {
    List<Categoria> findAll();
Optional<Categoria> findById(Integer id);
Categoria save(Categoria categoria);
Categoria update(Long id);
Optional<Categoria> delete(Long id);

}
