package com.grupog35.reto3.controller;

import com.grupog35.reto3.model.ClientModel;
import com.grupog35.reto3.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Client")
public class ClientController {

    @Autowired
    ClientService clientService;

    @GetMapping("/all")
    public List<ClientModel> obtener(){
        return clientService.obtener();
    }

    //Todo: Agregar el body al post porque falta el dbo
    @PostMapping("/save")
    public void crear(@RequestBody ClientModel client){
        clientService.crear(client);
    }

}
