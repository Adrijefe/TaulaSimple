package com.AdrianPeiro.TaulaSimple.Service;

import com.AdrianPeiro.TaulaSimple.Model.Provincia;
import com.AdrianPeiro.TaulaSimple.Model.ProvinciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProvinciaObtenerPorPais {
    @Autowired

    private ProvinciaRepository provinciaRepository;

    public List<Provincia> obtenerProvinciaPorPais (String nombrePais){
        List<Provincia> provincias = provinciaRepository.findAll();
        List<Provincia> resultado = new ArrayList<>();
        for (Provincia provincia : provincias){
            if (provincia.getPais()
                    .getNom()
                    .equalsIgnoreCase(nombrePais)){
                resultado.add(provincia);
            }

        }
        return resultado;
    }
    public  List<Provincia>getAll(){
        return provinciaRepository.findAll();
    }
}
