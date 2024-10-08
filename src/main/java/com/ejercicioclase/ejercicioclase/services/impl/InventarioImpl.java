package com.ejercicioclase.ejercicioclase.services.impl;


import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ejercicioclase.ejercicioclase.domain.entities.Inventario;
import com.ejercicioclase.ejercicioclase.domain.repository.InventarioRepository;
import com.ejercicioclase.ejercicioclase.services.InventarioService;


@Service
public class InventarioImpl implements InventarioService {

    @Autowired
    private InventarioRepository inventarioRepository;

    @Transactional
    @Override
    public List<Inventario> findAll() {
        return (List<Inventario>) inventarioRepository.findAll();
    }

    @Transactional
    @Override
    public Optional<Inventario> findById(Long id) {
        return inventarioRepository.findById(id);
    }

    @Transactional
    @Override
    public Inventario save(Inventario inventario) {
        return inventarioRepository.save(inventario);
    }

    @Transactional
    @Override
    public Inventario update(Long id) {
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Transactional
    @Override
    public Optional<Inventario> delete(Long id) {
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }
}
