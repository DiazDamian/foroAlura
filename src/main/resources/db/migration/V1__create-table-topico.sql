create table topicos(
id bigint not null auto_increment primary key,
titulo varchar(45) not null unique,
mensaje varchar(200) not null unique,
fecha_creacion date not null,
topico_status varchar(45),
autor bigint not null,
curso bigint not null
);