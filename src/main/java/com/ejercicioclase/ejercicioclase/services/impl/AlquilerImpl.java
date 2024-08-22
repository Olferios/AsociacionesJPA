package com.ejercicioclase.ejercicioclase.services.impl;


import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.ejercicioclase.ejercicioclase.domain.entities.Almacen;
import com.ejercicioclase.ejercicioclase.domain.entities.Alquiler;
import com.ejercicioclase.ejercicioclase.domain.repository.AlmacenRepository;
import com.ejercicioclase.ejercicioclase.domain.repository.AlquilerRepository;
import com.ejercicioclase.ejercicioclase.services.AlmacenService;
import com.ejercicioclase.ejercicioclase.services.AlquilerService;

public class AlquilerImpl implements AlquilerService{
     @Autowired
    private AlquilerRepository alquilerRepository;

    @Transactional
    @Override
    public List<Alquiler> findAll() {
        return (List<Alquiler>) alquilerRepository.findAll();
    }

    @Transactional
    @Override
    public Optional<Alquiler> findById(Integer id) {
        return alquilerRepository.findById(id);
    }

    @Transactional
    @Override
    public Alquiler save(Alquiler alquiler) {
        return alquilerRepository.save(alquiler);
    }

    @Transactional
    @Override
    public Alquiler update(Long id) {
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Transactional
    @Override
    public Optional<Alquiler> delete(Long id) {
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }
}
