package com.AdrianPeiro.TaulaSimple.Controller;

import com.AdrianPeiro.TaulaSimple.Model.Ciudad;
import com.AdrianPeiro.TaulaSimple.Model.Pais;
import com.AdrianPeiro.TaulaSimple.Model.Provincia;
import com.AdrianPeiro.TaulaSimple.Service.CiudadPoblacioMinimaService;
import com.AdrianPeiro.TaulaSimple.Service.PaisObtenerTodos;
import com.AdrianPeiro.TaulaSimple.Service.ProvinciaObtenerPorPais;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/localitzacions")
public class LocalitzacioRestController {
    @Autowired
    private PaisObtenerTodos paisObtenerTodos;

    @Autowired
    private ProvinciaObtenerPorPais provinciaObtenerPorPais;

    @Autowired
    private CiudadPoblacioMinimaService ciudadPoblacioMinimaService;

    @GetMapping("/paisos")
    public List<Pais> obtenerPais(){
        return paisObtenerTodos.obtenerPaisos();
    }

    @GetMapping("/provincies")
    public List<Provincia> obtenerProvincias(@RequestParam String nom){
        return provinciaObtenerPorPais.obtenerProvinciaPorPais(nom);
    }

    @GetMapping("/ciutats")
    public List<Ciudad> obtenerCiudadPoblacionMinima(@RequestParam int poblacionMinima){
        return ciudadPoblacioMinimaService.obtenerCiudadpoblacionMinima(poblacionMinima);
    }

}
