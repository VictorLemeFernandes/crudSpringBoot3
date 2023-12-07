package com.estudo.projetoUniversidade.domain.alunos;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "alunos")
@Entity(name = "Aluno")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String matricula;
    private String data_nascimento;
    private String curso;

    public Aluno(DadosCadastroAluno dados) {
        this.nome = dados.nome();
        this.matricula = dados.matricula();
        this.data_nascimento = dados.data_nascimento();
        this.curso = dados.curso();
    }
}
