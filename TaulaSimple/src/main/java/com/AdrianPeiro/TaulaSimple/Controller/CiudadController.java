package com.AdrianPeiro.TaulaSimple.Controller;


import com.AdrianPeiro.TaulaSimple.Model.Ciudad;
import com.AdrianPeiro.TaulaSimple.Model.CiudadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/ciudad")
public class CiudadController {
    @Autowired
    CiudadRepository ciudadRepository;

    @GetMapping
    public List<Ciudad> obtenerCiudad(){
        return (List<Ciudad>) ciudadRepository.findAll();

    }

    @GetMapping("/{id}")
    public ResponseEntity<Ciudad> ObtenerCiudadPorId (@PathVariable(value = "id")Long id){
        Optional<Ciudad> ciudad = ciudadRepository.findById(id);

        if (ciudad.isPresent()){
            return ResponseEntity.ok().body(ciudad.get());
        }
        else {
            return ResponseEntity.notFound().build();
        }
    }
    @PostMapping
    public Ciudad crearCiudad (@RequestBody Ciudad ciudad){
        return ciudadRepository.save(ciudad);
    }
    @DeleteMapping("/{id}")
    public void eliminarCiudad (@PathVariable Long id){ciudadRepository.deleteById(id);}


    @PutMapping("/{id}")
    public ResponseEntity<Ciudad>actualizarCiudad(@PathVariable Long id, @RequestBody Ciudad ciudadActualizada){
        Optional<Ciudad>optionalCiudad = ciudadRepository.findById(id);

        if (optionalCiudad.isPresent()){
            Ciudad ciudad = optionalCiudad.get();
            ciudad.setNombre(ciudadActualizada.getNombre());
            ciudad.setPoblación(ciudadActualizada.getPoblación());
            ciudadActualizada.setDescripción(ciudadActualizada.getDescripción());
            ciudadActualizada.setImagen(ciudadActualizada.getImagen());

            return ResponseEntity.ok().body(ciudadRepository.save(ciudad));
        }
        else {
            return ResponseEntity.notFound().build();
        }
    }
}
