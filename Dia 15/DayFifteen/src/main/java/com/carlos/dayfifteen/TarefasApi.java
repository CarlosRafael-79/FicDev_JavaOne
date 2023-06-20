/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.carlos.dayfifteen;

import java.util.ArrayList;
import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ficdev
 */
@SpringBootApplication
@RestController
@RequestMapping("/api/tarefas")
public class TarefasApi {

    private List< String> tarefas = new ArrayList<>();

    @GetMapping
    public List< String> listarTodasTarefas() {
        return tarefas;
    }

    @PostMapping
    public void criarTarefa(@RequestBody String tarefa) {
        tarefas.add(tarefa);
    }

    @DeleteMapping("/{id}")
    public void apagarTarefa(@PathVariable int id) {
        if (id >= 0 && id < tarefas.size()) {
            tarefas.remove(id);
        }
    }

    public static void main(String[] args) {
        SpringApplication.run(TarefasApi.class, args);
    }
}
