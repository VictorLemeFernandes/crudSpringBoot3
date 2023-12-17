package com.estudo.projetoUniversidade.domain.alunos;

public record DetalhamentoAluno (Long id, String nome, String data_nascimento, String curso, String matricula) {
    public DetalhamentoAluno(Aluno aluno) {
        this(aluno.getId(), aluno.getNome(), aluno.getData_nascimento(), aluno.getCurso(), aluno.getMatricula());
    }
}
