package com.usta.parcialnombre.rest;

import com.usta.parcialnombre.service.INombreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/nombre")
public class NombreRest {
    @Autowired
    private INombreService iNombreService;

    @GetMapping("/nombre")
    private String nombre() {
        return "Hola mi nombre es: " + iNombreService.traerNombre();
    }
}
