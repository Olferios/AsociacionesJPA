package com.ejercicioclase.ejercicioclase.services.impl;



import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ejercicioclase.ejercicioclase.domain.entities.Empleado;
import com.ejercicioclase.ejercicioclase.domain.repository.EmpleadoRepository;
import com.ejercicioclase.ejercicioclase.services.EmpleadoService;


@Service
public class EmpleadoImpl implements EmpleadoService {

    @Autowired
    private EmpleadoRepository empleadoRepository;

    @Transactional
    @Override
    public List<Empleado> findAll() {
        return (List<Empleado>) empleadoRepository.findAll();
    }

    @Transactional
    @Override
    public Optional<Empleado> findById(byte id) {
        return empleadoRepository.findById(id);
    }

    @Transactional
    @Override
    public Empleado save(Empleado empleado) {
        return empleadoRepository.save(empleado);
    }
    @Transactional
    @Override
    public Empleado update(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }
    @Transactional
    @Override
    public Optional<Empleado> delete(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

}

