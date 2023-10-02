create table topicos(
id bigint not null auto_increment primary key,
titulo varchar(45) not null unique,
mensaje varchar(200) not null unique,
fecha_creacion date not null,
topico_status varchar(45),
id_autor bigint not null,
nombre_autor varchar(45) not null,
id_curso bigint not null,
nombre_curso varchar(45) not null,
categoria_curso varchar(45) not null
);