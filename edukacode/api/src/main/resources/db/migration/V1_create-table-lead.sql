create table if not exists tb_lead(
    id bigint(20) not null auto_increment,
    nome varchar(255) not null,
    email varchar(255) not null,
    telefone varchar(255) not null,
    primary key(id)
);