create table alunos(
    id bigint not null auto_increment,
    nome varchar(100) not null,
    matricula varchar(25) not null,
    dataNascimento varchar(15) not null,
    curso varchar(50) not null,

    primary key(id)
);