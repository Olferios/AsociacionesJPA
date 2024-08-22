package com.ejercicioclase.ejercicioclase.services;
import java.util.List;
import java.util.Optional;
import com.ejercicioclase.ejercicioclase.domain.entities.Alquiler;

public interface AlquilerService {
    List<Alquiler> findAll();

    Optional<Alquiler> findById(Integer id);

    Alquiler save(Alquiler Alquiler);

    Alquiler update(Long id);

    Optional<Alquiler> delete(Long id);

}
