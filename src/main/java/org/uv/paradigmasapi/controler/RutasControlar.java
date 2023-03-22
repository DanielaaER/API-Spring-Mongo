package org.uv.paradigmasapi.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.uv.paradigmasapi.repository.IRutasRepository;

/* @author miran */

@RestController
@RequestMapping("/rutas")


public class RutasControlar {
    @Autowired
    IRutasRepository repo;
    
    @GetMapping
    public Iterable getRutas(){
        return repo.findAll();
    }
}
