package com.estudo.projetoUniversidade.domain.alunos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record DadosCadastroAluno(
        @NotBlank
        String nome,

        @NotBlank
        String matricula,

        @NotBlank
        @Pattern(regexp = "\\d{2}\\./?\\d{2}\\./?\\d{4}")
        String data_nascimento,

        @NotBlank
        String curso
) {
}
