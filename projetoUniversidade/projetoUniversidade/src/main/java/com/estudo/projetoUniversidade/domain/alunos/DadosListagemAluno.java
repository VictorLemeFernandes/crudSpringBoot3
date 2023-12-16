package com.estudo.projetoUniversidade.domain.alunos;

public record DadosListagemAluno(Long id, String nome, String matricula, String data_nascimento, String curso) {
    public DadosListagemAluno(Aluno aluno) {
        this(aluno.getId(), aluno.getNome(), aluno.getMatricula(), aluno.getData_nascimento(), aluno.getCurso());
    }
}
