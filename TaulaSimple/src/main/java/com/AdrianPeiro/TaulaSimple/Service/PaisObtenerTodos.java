package com.AdrianPeiro.TaulaSimple.Service;

import com.AdrianPeiro.TaulaSimple.Model.Pais;
import com.AdrianPeiro.TaulaSimple.Model.PaisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PaisObtenerTodos {
    @Autowired
    PaisRepository paisRepository;

    public List<Pais> obtenerPaisos(){
        return paisRepository.findAll();
    }

    public Optional<Pais> obtenerPaisPorId(Long id){
        return paisRepository.findById(id);
    }

}
