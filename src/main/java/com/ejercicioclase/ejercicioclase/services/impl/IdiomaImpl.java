package com.ejercicioclase.ejercicioclase.services.impl;



import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ejercicioclase.ejercicioclase.domain.entities.Idioma;
import com.ejercicioclase.ejercicioclase.domain.repository.IdiomaRepository;
import com.ejercicioclase.ejercicioclase.services.IdiomaService;


@Service
public class IdiomaImpl implements IdiomaService {

    @Autowired
    private IdiomaRepository idiomaRepository;

    @Transactional
    @Override
    public List<Idioma> findAll() {
        return (List<Idioma>) idiomaRepository.findAll();
    }

    @Transactional
    @Override
    public Optional<Idioma> findById(byte id) {
        return idiomaRepository.findById(id);
    }

    @Transactional
    @Override
    public Idioma save(Idioma idioma) {
        return idiomaRepository.save(idioma);
    }

    @Transactional
    @Override
    public Idioma update(Long id) {
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Transactional
    @Override
    public Optional<Idioma> delete(Long id) {
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }
}
