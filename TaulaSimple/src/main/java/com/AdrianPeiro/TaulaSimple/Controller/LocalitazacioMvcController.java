//package com.AdrianPeiro.TaulaSimple.Controller;
//
//import com.AdrianPeiro.TaulaSimple.Model.*;
//import com.AdrianPeiro.TaulaSimple.Service.CiudadPoblacioMinimaService;
//import com.AdrianPeiro.TaulaSimple.Service.ProvinciaObtenerPorPais;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.Banner;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//
//import java.util.List;
//
//@Controller
//
//public class LocalitazacioMvcController {
//    @Autowired
//    CiudadRepository ciudadPoblacio;
//
//    @Autowired
//    PaisRepository paisRepository;
//
//    @Autowired
//    ProvinciaRepository provinciaPais;
//
//    @Autowired
//    FranquiciaRepository franquiciaRepository;
//
//
//    @GetMapping("/pais")
//    public String verPaises(Model model){
//        List<Pais> paises = paisRepository.findAll();
//        model.addAttribute("paises",paises);
//        return "paises";
//
//    }
//
//    @GetMapping("/ciudad")
//    public String verCiudades(Model model){
//        List<Ciudad> ciudadList = ciudadPoblacio.findAll();
//        model.addAttribute("ciudad",ciudadList);
//        return "ciudad";
//    }
//
//    @GetMapping("/provincia")
//    public String verProvincias(Model model){
//        List<Provincia> provinciaList = provinciaPais.findAll();
//        model.addAttribute("provincia",provinciaList);
//        return "privincias";
//    }
//
//    @GetMapping("/franquicia")
//    public String verFranquicia(Model model){
//        model.addAttribute("franquicia",franquiciaRepository.findAll());
//        return "franquicia";
//    }
//
//
//}
