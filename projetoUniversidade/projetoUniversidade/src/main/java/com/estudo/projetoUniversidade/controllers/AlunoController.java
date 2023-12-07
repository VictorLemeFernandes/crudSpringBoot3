package com.estudo.projetoUniversidade.controllers;

import com.estudo.projetoUniversidade.domain.alunos.Aluno;
import com.estudo.projetoUniversidade.domain.alunos.AlunoRepository;
import com.estudo.projetoUniversidade.domain.alunos.DadosCadastroAluno;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/alunos")
public class AlunoController {
    @Autowired
    private AlunoRepository repository;

    @Transactional
    @PostMapping
    public ResponseEntity<?> cadastrar(@RequestBody DadosCadastroAluno dados) {
        var aluno = new Aluno(dados);
        repository.save(aluno);

        return ResponseEntity.ok().build();
    }
}
