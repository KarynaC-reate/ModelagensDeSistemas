CREATE TABLE tblead(
   id BIGINT NOT NULL auto_increment,
   nome VARCHAR(100) NOT NULL,   
   email VARCHAR(100) NOT NULL,
   telefone VARCHAR(100) NOT NULL,   
   PRIMARY KEY(id)
)

CREATE TABLE tbgenero(
   id BIGINT NOT NULL auto_increment primary key,
   nome VARCHAR(100) NOT NULL,   
)

CREATE TABLE tbpersonagem(
   id BIGINT NOT NULL auto_increment primary key,
   nome VARCHAR(100) NOT NULL,
   arquetipo VARCHAR(100) NOT NULL,
   historia VARCHAR(1000) NOT NULL,
   personalidade VARCHAR(1000) NOT NULL,
   motivacoes VARCHAR(1000) NOT NULL,
   aparencia VARCHAR(1000) NOT NULL,

)