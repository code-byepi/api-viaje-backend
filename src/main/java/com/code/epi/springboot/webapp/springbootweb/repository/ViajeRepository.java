package com.code.epi.springboot.webapp.springbootweb.repository;

import com.code.epi.springboot.webapp.springbootweb.models.entities.Viaje;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ViajeRepository extends CrudRepository<Viaje, Integer> {
    public List<Viaje> findByPais(String pais);  // buscar por pais. Devuelve Lista
    public List<Viaje> findByCiudad(String ciudad); // buscar por ciudad. Devuelve lista
}
