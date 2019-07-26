CREATE TABLE empresa
(
	id LONG,
	nomeFantasia VARCHAR(800),
	razaoSocial VARCHAR(800),
	caminhoFoto VARCHAR(800)
);

CREATE TABLE linha
(
	id LONG,
    idEmpresa LONG,
	descricao VARCHAR(800)
);

CREATE TABLE linhaPonto
(
	id LONG,
    idLinha LONG,
	idPonto LONG
);

CREATE TABLE ponto
(
	id LONG,
	latitude DECIMAL,
	longitude DECIMAL,
	nome VARCHAR(800),
    descricao VARCHAR(800),
    parada BOOLEAN,
    referencia BOOLEAN,
    caminhoFoto VARCHAR(800)
);

CREATE TABLE usuario
(
	id LONG,
	nome VARCHAR(800),
    email VARCHAR(800),
    senha VARCHAR(800),
    referencia BOOLEAN,
    caminhoFoto VARCHAR(800)
);