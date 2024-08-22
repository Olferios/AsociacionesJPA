package com.ejercicioclase.ejercicioclase.domain.repository;

import org.springframework.data.repository.CrudRepository;

import com.ejercicioclase.ejercicioclase.domain.entities.Almacen;

public interface AlmacenRepository extends
    CrudRepository <Almacen,Byte>{ 

}
