/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.carlos.controller;


import com.carlos.model.Estoque;
import com.carlos.repository.EstoqueRepository;
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
@RequestMapping("/api/Estoque")
public class EstoqueController {
    @Autowired
    private EstoqueRepository estoqueRepository;

    @Autowired
    public EstoqueController(EstoqueRepository estoqueRepository) {
        this.estoqueRepository = estoqueRepository;
    }
    
    @GetMapping
    public List<Estoque> listarTodosEstoque() {
        return estoqueRepository.findAll();
    }
    
    @PostMapping
    @Transactional
    public ResponseEntity<Estoque> cadastrarEstoque(@RequestBody Estoque estoque) {
        estoqueRepository.save(estoque);
        return ResponseEntity.status(HttpStatus.CREATED).body(estoque);
    }
    
    @PutMapping("/{id}")
    @Transactional
    public ResponseEntity<Estoque> alterarEstoque(@PathVariable int id, @RequestBody Estoque atualizado) {

        Estoque estoque = estoqueRepository.findById(id).orElse(null);
        if (estoque != null) {
            
            estoque.setQuantidadeItens(atualizado.getQuantidadeItens());
            estoque.setData(atualizado.getData());
            estoque.setEntregador(atualizado.getEntregador());
            
            estoqueRepository.save(estoque);
            return ResponseEntity.ok(estoque);
        } else {
            return ResponseEntity.notFound().build();
        }

    }
    
    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity<Void> deletarEstoque(@PathVariable int id) {

        Estoque entregador = estoqueRepository.findById(id).orElse(null);

        if (entregador != null) {
            estoqueRepository.delete(entregador);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }

    }
}
