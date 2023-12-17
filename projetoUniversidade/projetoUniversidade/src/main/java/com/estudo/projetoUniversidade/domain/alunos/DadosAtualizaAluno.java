package com.estudo.projetoUniversidade.domain.alunos;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DadosAtualizaAluno(
        @NotNull
        Long id,
        String nome,
        @Pattern(regexp = "\\d{2}/?\\d{2}/?\\d{4}")
        String data_nascimento,
        String curso,
        String matricula
) { }
