create database if not exists dbDomDomLanches;
use dbDomDomLanches;
create table tbUsuarios(
idUser int primary key auto_increment, 
Usuario varchar(50) not null,
Fone varchar(15),
Login varchar(15) not null unique,
Senha varchar(10)not null,
Perfil varchar(10) not null
);

describe tbUsuarios;
insert  into tbUsuarios(idUser,Usuario,Fone,Login,Senha,Perfil)
values(1,'Adonai DomDom','1234567898','DomDom','12345','Admin');
insert  into tbUsuarios(Usuario,Fone,Login,Senha,Perfil)
values('Tela','1234567898','tela','123','User');
select * from tbUsuarios;

create table tbClientes(
idCliente int primary key auto_increment,
nomeCliente varchar(50) not null,
cidadeCliente varchar(50) not null,
bairroCliente varchar(50) not null,
endCliente varchar(50) not null,
cepCliente varchar(50)  not null,
emailCLiente varchar(50) not null
);
select * from tbClientes;
create table tbCardapio(
idLanche int primary key auto_increment,
nomeLanche varchar(30) not null,
descLanche varchar(40) not null,
valorLanche decimal(4,2) not null);

create table tbBebidas(
idBebida int primary key auto_increment,
nomeBebida varchar(10) not null,  
descBebida varchar(30) not null,       
valorBebida decimal(4,2) not null);

create table tbPedidos(
idPedido int primary key auto_increment,
dataPedido timestamp default current_timestamp,
idCliente int,
idLanche int not null,
idBebida int not null,
foreign key (idCliente) references tbClientes (idCliente),
foreign key (idLanche) references tbCardapio (idLanche),
foreign key (idBebida) references tbBebidas (idBebida));

describe tbCardapio;
insert into tbCardapio (idLanche,nomeLanche,descLanche,valorLanche)
values(1,'Bolo','sabor de chocolate recheado',15.00);
insert into tbCardapio (idLanche,nomeLanche,descLanche,valorLanche)
values(2,'cachorro','recheado com batata palha ,mostarda e tomate',7.00);
insert into tbCardapio (idLanche,nomeLanche,descLanche,valorLanche)
values(3,'coxinha','sabor frango recheado com catupiry',8.00);
insert into tbCardapio (idLanche,nomeLanche,descLanche,valorLanche)
values(4,'brownie','bolo denso e úmido  redondo ou quadrado',5.00);
insert into tbCardapio (idLanche,nomeLanche,descLanche,valorLanche)
values(5,'pudim',' mistura de ingredientes com por liga com farinha de trigo',16.00);
insert into tbCardapio (idLanche,nomeLanche,descLanche,valorLanche)
values(6,'Sanduiche','pao recheado com queijo e presunto',9.00);
insert into tbCardapio (idLanche,nomeLanche,descLanche,valorLanche)
values(7,'pizza','sabor calabresa com cebola e tomate',25.00);
insert into tbCardapio (idLanche,nomeLanche,descLanche,valorLanche)
values(8,'pastel','7 opçoes de recheio por escolha do cliente',10.00);
select * from tbCardapio;

describe tbBebidas;
insert into tbBebidas (idBebida,nomeBebida,descBebida,valorBebida)
values (9,'Milkshake','espessa e cremosa com leite,sorvete e calda saborizada',14.00);
insert into tbBebidas (idBebida,nomeBebida,descBebida,valorBebida)
values (10,'refrigerante','coca cola ou antartica',8.00);
insert into tbBebidas (idBebida,nomeBebida,descBebida,valorBebida)
values (11,'suco','sabor laranja,acerola ou maracujá',8.00);
select * from tbCardapio;