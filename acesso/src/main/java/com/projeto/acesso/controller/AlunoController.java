package com.projeto.acesso.controller;

import com.projeto.acesso.model.Aluno;
import com.projeto.acesso.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos") // O endereço será http://localhost:8080/alunos
public class AlunoController {

    @Autowired
    private AlunoRepository repository;

    // Listar todos (GET)
    @GetMapping
    public List<Aluno> listar() {
        return repository.findAll();
    }

    // Cadastrar (POST)
    @PostMapping
    public Aluno cadastrar(@RequestBody Aluno aluno) {
        System.out.println("Cadastrando aluno: " + aluno.getNome());
        return repository.save(aluno);
    }
    
    // Deletar (DELETE)
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
