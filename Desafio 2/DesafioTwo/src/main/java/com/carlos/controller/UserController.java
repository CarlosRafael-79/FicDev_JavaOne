package com.carlos.controller;


import com.carlos.model.User;
import com.carlos.repository.UserRepository;

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
@RequestMapping("/api/User")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    
    @GetMapping
    public List<User> listarTodosUser() {
        return userRepository.findAll();
    }
    
    @PostMapping
    @Transactional
    public ResponseEntity<User> cadastrarUser(@RequestBody User user) {
        userRepository.save(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }
    
    @PutMapping("/{id}")
    @Transactional
    public ResponseEntity<User> alterarUser(@PathVariable int id, @RequestBody User atualizado) {

        User user = userRepository.findById(id).orElse(null);
        if (user != null) {
            
            user.setNome(atualizado.getNome());
            user.setSenha(user.getSenha());
            user.setUuid(user.getUuid());
            
            userRepository.save(user);
            return ResponseEntity.ok(user);
        } else {
            return ResponseEntity.notFound().build();
        }

    }
    
    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity<Void> deletarUser(@PathVariable int id) {

        User user = userRepository.findById(id).orElse(null);

        if (user != null) {
            userRepository.delete(user);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }

    }
    
    
}