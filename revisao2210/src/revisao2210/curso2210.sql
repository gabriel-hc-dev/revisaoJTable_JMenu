create table curso(
codigoCurso int primary key not null,
nomeCurso varchar(80) not null,
periodoCurso varchar(50) not null,
cargaHoraria varchar(10));

create table aluno(
codigoAluno int primary key not null,
nomeAluno varchar(80) not null,
idadeAluno int not null,
codigoCurso int not null,
foreign key (codigoCurso) references curso);