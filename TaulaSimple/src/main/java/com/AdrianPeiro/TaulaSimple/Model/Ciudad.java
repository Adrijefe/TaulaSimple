package com.AdrianPeiro.TaulaSimple.Model;

import jakarta.persistence.*;

@Entity
@Table
public class Ciudad {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    String nombre;
    int población;
    String descripción;
    String imagen;

    public Ciudad(){}

    public Ciudad(String imagen, String descripción, int población, String nombre, long id) {
        this.imagen = imagen;
        this.descripción = descripción;
        this.población = población;
        this.nombre = nombre;
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPoblación() {
        return población;
    }

    public void setPoblación(int población) {
        this.población = población;
    }

    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
}
