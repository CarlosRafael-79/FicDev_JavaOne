/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.carlos.controller;

import com.carlos.model.Livro;
import com.carlos.repository.LivroRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/livros")
public class LivroController {
    
    @Autowired
    private LivroRepository livrosRepository;

    @Autowired
    public LivroController(LivroRepository livrosRepository) {
        this.livrosRepository = livrosRepository;
    }
    
    @GetMapping
    public List<Livro> listarTodosLivros() {
        return livrosRepository.findAll();
    }

    @PostMapping
    @Transactional
    public void criarTarefa(@RequestBody Livro livro) {
        livrosRepository.save(livro);
    }
}
