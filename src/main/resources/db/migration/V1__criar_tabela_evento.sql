--- Criar tabele evento sql

CREATE TABLE  Eventos(
git
    id BIGINT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    descricao VARCHAR(255) NOT NULL,
    tipoDoEvento VARCHAR(50) NOT NULL,
    data_inicio TIMESTAMP NOT NULL ,
    data_fim TIMESTAMP NOT NULL,
    mesa INTEGER,
    identificador VARCHAR(255) NOT NULL UNIQUE,
    capacidade INTEGER

)


