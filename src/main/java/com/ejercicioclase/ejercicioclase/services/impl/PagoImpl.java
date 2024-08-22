package com.ejercicioclase.ejercicioclase.services.impl;





import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ejercicioclase.ejercicioclase.domain.entities.Pago;
import com.ejercicioclase.ejercicioclase.domain.repository.PagoRepository;
import com.ejercicioclase.ejercicioclase.services.PagoService;


@Service
public class PagoImpl implements PagoService {

    @Autowired
    private PagoRepository pagoRepository;

    @Transactional
    @Override
    public List<Pago> findAll() {
        return (List<Pago>) pagoRepository.findAll();
    }

    @Transactional
    @Override
    public Optional<Pago> findById(Integer id) {
        return pagoRepository.findById(id);
    }

    @Transactional
    @Override
    public Pago save(Pago pago) {
        return pagoRepository.save(pago);
    }

    @Transactional
    @Override
    public Pago update(Long id) {
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Transactional
    @Override
    public Optional<Pago> delete(Long id) {
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }
}
