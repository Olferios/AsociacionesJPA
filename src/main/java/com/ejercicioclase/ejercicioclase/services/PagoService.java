package com.ejercicioclase.ejercicioclase.services;
import java.util.List;
import java.util.Optional;

import com.ejercicioclase.ejercicioclase.domain.entities.Pago;
public interface PagoService {
     List<Pago> findAll();
Optional<Pago> findById(Integer id);
Pago save(Pago pago);
Pago update(Long id);
Optional<Pago> delete(Long id);

}
