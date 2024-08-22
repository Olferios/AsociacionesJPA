package com.ejercicioclase.ejercicioclase.services;

import java.util.List;
import java.util.Optional;

import com.ejercicioclase.ejercicioclase.domain.entities.Empleado;

public interface EmpleadoService {
        List<Empleado> findAll();
Optional<Empleado> findById(byte id);
Empleado save(Empleado empleado);
Empleado update(Long id);
Optional<Empleado> delete(Long id);

}
