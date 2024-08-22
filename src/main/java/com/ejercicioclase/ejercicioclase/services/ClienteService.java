package com.ejercicioclase.ejercicioclase.services;

import java.util.List;
import java.util.Optional;
import com.ejercicioclase.ejercicioclase.domain.entities.Cliente;

public interface ClienteService {
      List<Cliente> findAll();

      Optional<Cliente> findById(Long id);

      Cliente save(Cliente cliente);

      Cliente update(Long id);

      Optional<Cliente> delete(Long id);

}
