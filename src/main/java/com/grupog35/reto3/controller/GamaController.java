package com.grupog35.reto3.controller;

import com.grupog35.reto3.model.GamaModel;
import com.grupog35.reto3.service.GamaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Gama")
public class GamaController {

    @Autowired
    GamaService gamaService;

    @GetMapping("/all")
    public List<GamaModel> obtenerGamas(){
        return gamaService.obtener();
    }

    @PostMapping("/save")
    public void crearGamas(@RequestBody GamaModel gama){
        gamaService.crear(gama);
    }

}
