package com.AdrianPeiro.TaulaSimple.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table

public class Pais {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    @Column(nullable = false)
    String nom;
    @JsonIgnoreProperties("pais")

    @OneToMany(mappedBy = "pais",cascade = CascadeType.ALL)
    private List<Provincia> provincias;


    public Pais() {
    }

    public Pais(long id, String nom) {
        Id = id;
        this.nom = nom;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Provincia>getProvincias(){
        return provincias;
    }

    public void setProvincias(List<Provincia> provincias) {
        this.provincias = provincias;
    }
}