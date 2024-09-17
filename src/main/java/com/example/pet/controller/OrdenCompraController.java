package com.example.pet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.pet.model.OrdenCompra;
import com.example.pet.service.PetService;

import java.util.List;
import java.util.Optional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;



@RestController
@RequestMapping("/pet")
public class OrdenCompraController {
    @Autowired
    private PetService petService;

    @GetMapping
    public List<OrdenCompra> getAllOrdenCompra(){
        return petService.getAllOrdenCompra();
    }
        
    @GetMapping("/{id}")
    public Optional<OrdenCompra> getOrdenCompraById(@PathVariable Long id) {
        return petService.getOrdenCompraById(id);
    }

    @PostMapping
    public OrdenCompra createOrdenCompra(@RequestBody OrdenCompra ordenCompra) {
        return petService.createOrdenCompra(ordenCompra);
    }

    @PutMapping("/{id}")
    public OrdenCompra updateOrdenCompra(@PathVariable Long id, @RequestBody OrdenCompra ordenCompra) {
        return petService.updateOrdenCompra(id, ordenCompra);
    }

    @DeleteMapping("/{id}")
    public void deleteOrdenCompra(@PathVariable Long id)
    {
        petService.deleteOrdenCompra(id);
    }
}