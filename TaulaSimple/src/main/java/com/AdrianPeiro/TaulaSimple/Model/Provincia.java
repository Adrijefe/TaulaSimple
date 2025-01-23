package com.AdrianPeiro.TaulaSimple.Model;

import jakarta.persistence.*;

@Entity
@Table
public class Provincia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    @Column(nullable = false)
    String nom;


    public Provincia() {}

    public Provincia(long id, String nom) {
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
}