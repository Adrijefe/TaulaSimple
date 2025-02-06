package com.AdrianPeiro.TaulaSimple.Service;

import com.AdrianPeiro.TaulaSimple.Model.Ciudad;
import com.AdrianPeiro.TaulaSimple.Model.CiudadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CiudadPoblacioMinimaService {

    @Autowired
    private CiudadRepository ciudadRepository;
    public List <Ciudad> obtenerCiudadpoblacionMinima(int minima){
        List<Ciudad> todasLasCiudades = ciudadRepository.findAll();
        List<Ciudad> ciudadFiltradas = new ArrayList<>();

        for (Ciudad ciudad : todasLasCiudades){
            if (ciudad.getPoblacio()>minima){
                ciudadFiltradas.add(ciudad);
            }
        }
        return ciudadFiltradas;
    }
    public List<Ciudad>getAll(){
        return ciudadRepository.findAll();
}
}
