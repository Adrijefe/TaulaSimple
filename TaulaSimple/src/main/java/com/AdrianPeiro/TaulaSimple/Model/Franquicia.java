package com.AdrianPeiro.TaulaSimple.Model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table
public class Franquicia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    @Column(nullable = false)
    String nom;

    @ManyToMany(mappedBy = "franquicia")
    List<Ciudad> ciutats;

    public Franquicia() {
    }

    public Franquicia(long id, String nom, List<Ciudad> ciutats) {
        this.id = id;
        this.nom = nom;
        this.ciutats = ciutats;
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

    public List<Ciudad> getCiutats() {
        return ciutats;
    }

    public void setCiutats(List<Ciudad> ciutats) {
        this.ciutats = ciutats;
    }
}
