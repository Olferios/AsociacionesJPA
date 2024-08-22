package com.ejercicioclase.ejercicioclase.services;

import java.util.List;
import java.util.Optional;

import com.ejercicioclase.ejercicioclase.domain.entities.Idioma;
public interface IdiomaService {
     List<Idioma> findAll();
Optional<Idioma> findById(byte id);
Idioma save(Idioma idioma);
Idioma update(Long id);
Optional<Idioma> delete(Long id);

}
