package com.AdrianPeiro.TaulaSimple.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table
public class Ciudad {
    @Id
    @Column(insertable=false, updatable=false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    String nom;
    int poblacio;
    String descripcio;
    String imagen;

    @JsonIgnoreProperties("provincia_id")
    @ManyToOne
    @JoinColumn(name = "provincia_id", nullable = false)
     Provincia provincia;

    @JsonIgnoreProperties("franquicia_ciudad")

    @ManyToMany
    @JoinTable(
            name = "franquicia_ciudad",
            joinColumns = @JoinColumn(name="idciudad"),
            inverseJoinColumns = @JoinColumn(name = "idfranquicia")
    )
    List<Franquicia> franquicia;



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

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }

    public int getPoblacio() {
        return poblacio;
    }

    public void setPoblacio(int poblacio) {
        this.poblacio = poblacio;
    }

    public String getDescripcio() {
        return descripcio;
    }

    public void setDescripcio(String descripcio) {
        this.descripcio = descripcio;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public List<Franquicia> getFranquicia() {
        return franquicia;
    }

    public void setFranquicia(List<Franquicia> franquicia) {
        this.franquicia = franquicia;
    }
}
