package com.ejercicioclase.ejercicioclase.services.impl;



import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ejercicioclase.ejercicioclase.domain.entities.Direccion;
import com.ejercicioclase.ejercicioclase.domain.repository.DireccionRepository;
import com.ejercicioclase.ejercicioclase.services.DireccionService;


@Service
public class DireccionImpl implements DireccionService {

    @Autowired
    private DireccionRepository direccionRepository;

    @Transactional
    @Override
    public List<Direccion> findAll() {
        return (List<Direccion>) direccionRepository.findAll();
    }

 

    @Transactional
    @Override
    public Direccion save(Direccion direccion) {
        return direccionRepository.save(direccion);
    }

    @Transactional
    @Override
    public Direccion update(Long id) {
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Transactional
    @Override
    public Optional<Direccion> delete(Long id) {
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }
    @Transactional
    @Override
    public Optional<Direccion> findById(short id) {
        return direccionRepository.findById(id);
      }
}
