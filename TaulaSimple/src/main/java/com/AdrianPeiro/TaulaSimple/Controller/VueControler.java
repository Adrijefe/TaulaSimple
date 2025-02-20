package com.AdrianPeiro.TaulaSimple.Controller;

import com.AdrianPeiro.TaulaSimple.Model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")

public class VueControler {
    @Autowired
    CiudadRepository ciudadRepository;

    @Autowired
    PaisRepository paisRepository;

    @Autowired
    ProvinciaRepository provinciaRepository;

    @Autowired
    FranquiciaRepository franquiciaRepository;


    @GetMapping("/ciutats")
    public List<Ciudad> obtnerCiudad(){
        return ciudadRepository.findAll();

    }

    @PostMapping("/addciutats")
    public void añadirCiudad(@RequestBody Ciudad ciudad){
        ciudadRepository.save(ciudad);
    }
    @DeleteMapping("/delciutat/{id}")
    public void eliminarCiudad (@PathVariable Long id){
        franquiciaRepository.deleteById(id);
        ciudadRepository.deleteById(id);

    }

    @GetMapping("/franquicias")
    public List<Franquicia> getFranquicias() {
        return franquiciaRepository.findAll();
    }

    @DeleteMapping("/franquicia/{id}")
    public void deleteFranquicia(@PathVariable Long id){
        franquiciaRepository.deleteById(id);
    }

    @GetMapping("/pais")
    public List<Pais> getPais() {
        return paisRepository.findAll();
    }

    @DeleteMapping("/pais/{id}")
    public void deletePais(@PathVariable Long id){
        paisRepository.deleteById(id);
    }

    @PostMapping("/addpais")
    public void añadirpais(@RequestBody Pais pais){
        paisRepository.save(pais);
    }

    @GetMapping("/provincia")
    public List<Provincia> getProvincia() {
        return provinciaRepository.findAll();
    }

    @DeleteMapping("/provincia/{id}")
    public void deleteProvincia(@PathVariable Long id){
        provinciaRepository.deleteById(id);
    }

    @PostMapping("/addprovincia")
    public void añadirprovincia(@RequestBody Provincia provincia){
        provinciaRepository.save(provincia);
    }




}
