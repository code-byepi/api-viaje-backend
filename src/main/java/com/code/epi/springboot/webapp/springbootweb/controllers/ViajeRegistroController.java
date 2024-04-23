package com.code.epi.springboot.webapp.springbootweb.controllers;


import com.code.epi.springboot.webapp.springbootweb.models.entities.Viaje;
import com.code.epi.springboot.webapp.springbootweb.repository.ViajeRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/viajes")
public class ViajeRegistroController {

    private final ViajeRepository viajeRepository;

    public ViajeRegistroController(ViajeRepository viajeRepository) {
        this.viajeRepository = viajeRepository;
    }

    @GetMapping()
    public Iterable<Viaje> getAllViajes() {
        return this.viajeRepository.findAll();
    }

    @GetMapping("/ciudad")
    public List<Viaje> getByCiudad(@RequestParam(name = "ciudad") String ciudad) {
        return this.viajeRepository.findByCiudad(ciudad);
    }

    @PostMapping(("/nuevoViaje"))
    public Viaje registrarNuevoViaje(@RequestBody Viaje viaje) {
        Viaje newViaje = this.viajeRepository.save(viaje);
        return newViaje;
    }
}
