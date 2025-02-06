package com.AdrianPeiro.TaulaSimple.Service;

import com.AdrianPeiro.TaulaSimple.Model.*;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListarBD {
    @Autowired
    private PaisRepository paisRepository;

    @Autowired
    private ProvinciaRepository provinciaRepository;

    @Autowired
    private CiudadRepository ciudadRepository;


    void listarPaises(){
        List<Pais> paisos = paisRepository.findAll();
        for (Pais pais :paisos){
            System.out.println("Pais : " + pais.getNom());

        }
    }

    void listarProvincia(){
        List<Provincia> provincias = provinciaRepository.findAll();
        for (Provincia provincia : provincias ){
            System.out.println("Provincia : " + provincia.getNom());

        }
    }

    void listarCiudades(){
        List<Ciudad> ciudades =  ciudadRepository.findAll();
        for (Ciudad ciudad :ciudades){
            System.out.println("Ciudad : " + ciudad.getNom());

        }
    }


    @PostConstruct
    public void inicializar(){
        listarCiudades();
        listarPaises();
        listarProvincia();
    }

}
