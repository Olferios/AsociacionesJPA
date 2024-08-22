package com.ejercicioclase.ejercicioclase.domain.repository;

import org.springframework.data.repository.CrudRepository;

import com.ejercicioclase.ejercicioclase.domain.entities.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente,Long> {

}
