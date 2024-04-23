package com.code.epi.springboot.webapp.springbootweb.models.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "VIAJES")
@Getter
@Setter
public class Viaje {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "FECHA")
    private Date fecha = new Date();

    @Column(name = "PAIS")
    private String pais;

    @Column(name = "CIUDAD")
    private String ciudad;

    @Column(name = "NUM_PHOTOS")
    private Long numPhotos;

    @Column(name = "BLOG_COMPLETO")
    private Boolean blogCompleto;

    // constructor - 1
    public Viaje() {
    }

    // constructor - 2
    public Viaje(Integer id, String pais, String ciudad, Long numPhotos, Boolean blogCompleto) {
        this.id = id;
        this.pais = pais;
        this.ciudad = ciudad;
        this.numPhotos = numPhotos;
        this.blogCompleto = blogCompleto;
    }

}
