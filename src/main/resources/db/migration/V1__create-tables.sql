create table autores(
id int not null auto_increment primary key,
nombre varchar(45) not null,
 email varchar(45) not null unique,
 contraseña varchar(45) not null);
create table cursos(
id int not null auto_increment primary key,
nombre varchar(45) not null,
categoria varchar(45) not null
) ;
create table topicos(
id bigint not null auto_increment primary key,
titulo varchar(45) not null unique,
mensaje varchar(200) not null unique,
fecha_creacion datetime not null,
topico_status varchar(45),
autor int ,
curso int ,
FOREIGN KEY (autor) REFERENCES autores(id),
FOREIGN KEY (curso) REFERENCES cursos(id)
);