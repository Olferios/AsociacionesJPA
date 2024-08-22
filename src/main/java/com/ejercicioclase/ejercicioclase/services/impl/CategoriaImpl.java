package com.ejercicioclase.ejercicioclase.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ejercicioclase.ejercicioclase.domain.entities.Alquiler;
import com.ejercicioclase.ejercicioclase.domain.entities.Categoria;
import com.ejercicioclase.ejercicioclase.domain.repository.CategoriaRepository;
import com.ejercicioclase.ejercicioclase.services.CategoriaService;


@Service
public class CategoriaImpl implements CategoriaService {

   
    @Autowired
    private CategoriaRepository categoriaRepository;

    @Transactional
    @Override
    public List<Categoria> findAll() {
        return (List<Categoria>) categoriaRepository.findAll();
    }



    @Transactional
    @Override
    public Categoria save(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    @Transactional
    @Override
    public Categoria update(Long id) {
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Transactional
    @Override
    public Optional<Categoria> delete(Long id) {
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Transactional
    @Override
    public Optional<Categoria> findById(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }
}
