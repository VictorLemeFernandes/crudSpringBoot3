package com.estudo.projetoUniversidade.controllers;

import com.estudo.projetoUniversidade.domain.alunos.Aluno;
import com.estudo.projetoUniversidade.domain.alunos.AlunoRepository;
import com.estudo.projetoUniversidade.domain.alunos.DadosCadastroAluno;
import com.estudo.projetoUniversidade.domain.alunos.DadosListagemAluno;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/alunos")
public class AlunoController {
    @Autowired
    private AlunoRepository repository;

    @Transactional
    @PostMapping
    public ResponseEntity<?> cadastrar(@RequestBody @Valid DadosCadastroAluno dados) {
        var aluno = new Aluno(dados);
        repository.save(aluno);

        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<Page<DadosListagemAluno>> mostrar(@PageableDefault(size = 10, sort = {"nome"}) Pageable paginacao) {
        var pagina = repository.findAll(paginacao).map(DadosListagemAluno::new);

        return ResponseEntity.ok(pagina);
    }
}
