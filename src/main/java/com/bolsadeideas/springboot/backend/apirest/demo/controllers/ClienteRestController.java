package com.bolsadeideas.springboot.backend.apirest.demo.controllers;

import com.bolsadeideas.springboot.backend.apirest.demo.models.entity.Cliente;
import com.bolsadeideas.springboot.backend.apirest.demo.models.services.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class ClienteRestController {
    @Autowired
    private IClienteService clienteService;

    @GetMapping("/clientes")
    public List<Cliente> index() {
        return clienteService.findAll();
    }

    @GetMapping("/cliente/{id}")
    public Cliente show(@PathVariable Long id) {
        return clienteService.findById(id);
    }

    @PostMapping("/clientes")
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente create(@RequestBody Cliente cliente) {
        return clienteService.save(cliente);
    }

    @PutMapping("/cliente/{id}")
    public Cliente update(@RequestBody Cliente cliente, @PathVariable Long id) {
        Cliente clienteActual = clienteService.findById(id);
        //TODO fix setter using Lombok
        return clienteService.save(clienteActual);
    }
}

