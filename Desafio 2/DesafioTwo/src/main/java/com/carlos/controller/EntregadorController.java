/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.carlos.controller;

import com.carlos.model.Entregador;
import com.carlos.repository.EntregadorRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/Entregador")
public class EntregadorController {
    
    @Autowired
    private EntregadorRepository entregadorRepository;

    @Autowired
    public EntregadorController(EntregadorRepository entragadorRepository) {
        this.entregadorRepository = entragadorRepository;
    }
    
    @GetMapping
    public List<Entregador> listarTodosEntregador() {
        return entregadorRepository.findAll();
    }
    
    @PostMapping
    @Transactional
    public ResponseEntity<Entregador> cadastrarEntregador(@RequestBody Entregador entregador) {
        entregadorRepository.save(entregador);
        return ResponseEntity.status(HttpStatus.CREATED).body(entregador);
    }
    
    @PutMapping("/{id}")
    @Transactional
    public ResponseEntity<Entregador> alterarEntregador(@PathVariable int id, @RequestBody Entregador atualizado) {

        Entregador entregador = entregadorRepository.findById(id).orElse(null);
        if (entregador != null) {
            
            entregador.setNome(atualizado.getNome());
            entregador.setCnh(atualizado.getCnh());
            entregador.setUltimaEntrega(atualizado.getUltimaEntrega());
            entregador.setUuid(entregador.getUuid());
            entregadorRepository.save(entregador);
            return ResponseEntity.ok(entregador);
        } else {
            return ResponseEntity.notFound().build();
        }

    }
    
    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity<Void> deletarEntregador(@PathVariable int id) {

        Entregador entregador = entregadorRepository.findById(id).orElse(null);

        if (entregador != null) {
            entregadorRepository.delete(entregador);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }

    }
}
