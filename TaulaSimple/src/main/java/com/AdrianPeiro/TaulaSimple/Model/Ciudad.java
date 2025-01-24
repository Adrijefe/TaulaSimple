package com.AdrianPeiro.TaulaSimple.Model;

import jakarta.persistence.*;

@Entity
@Table
public class Ciudad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    String nom;


    @OneToOne
    @JoinColumn(name = "provincia_id", nullable = false)
    private Provincia provincia;




    public Ciudad() {}

    public Ciudad(long id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
