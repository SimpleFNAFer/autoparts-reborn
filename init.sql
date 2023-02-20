drop database autoparts;
create database autoparts;
use autoparts;

create table if not exists type (
	id int not null,
	title varchar(255) not null,
	
	unique (id),
	primary key (id)
);

create table if not exists supplier (
	id int not null,
	title varchar(255) not null,
	
	unique (id),
	primary key (id)
);

create table if not exists model (
	id int not null,
	title varchar(255) not null,
	
	unique (id),
	primary key (id)
);

create table if not exists part (
	id int not null,
	type_id int not null,
	model_id int not null,
	supplier_id int not null,
	price decimal not null,

	unique (id),
	primary key (id)
);

create table if not exists cart (
	id int not null,
	user_id int not null,

	unique (id),
	primary key (id)
);

create table if not exists `order` (
	id int not null,
	user_id int not null,

	unique (id),
	primary key (id)
);

create table if not exists `user` (
	id int not null,
	login varchar(50) not null,
	password varchar(255),

	unique (id),
	primary key (id)
);

create table if not exists `replace`(
	id int not null auto_increment,
	origin_id int not null,
	replace_id int not null,

	unique (id),
	primary key (id)
);

create table if not exists cart_part (
	id int not null auto_increment,
	cart_id int not null,
	part_id int not null,
	`number` int not null,

	unique (id),
	primary key (id)
);

create table if not exists order_part (
	id int not null auto_increment,
	order_id int not null,
	part_id int not null,
	`number` int not null,

	unique (id),
	primary key (id)
);

insert into type values (1, 'Муфты подключения переднего моста');
insert into type values (2, 'Комплект подшипника ступицы колеса');
insert into type values (3, 'Датчик детонации');

insert into supplier values (1, 'Автостандарт');
insert into supplier values (2, 'Деталь логистик');
insert into supplier values (3, 'Герц');

insert into model values (1, 'Volkswagen');
insert into model values (2, 'Kia');
insert into model values (3, 'NTL');
insert into model values (4, 'Renault');
insert into model values (5, 'Nissan');
insert into model values (6, 'Vaf');
insert into model values (7, 'Audi');
insert into model values (8, 'Skoda');
insert into model values (9, 'Zikmar');

insert into part values (1, 1, 1, 1, 9650);
insert into part values (2, 1, 2, 2, 11000);
insert into part values (3, 1, 3, 3, 4400);
insert into part values (4, 2, 1, 1, 5200);
insert into part values (5, 2, 2, 2, 6000);
insert into part values (6, 2, 6, 3, 4000);
insert into part values (7, 3, 1, 1, 1800);
insert into part values (8, 3, 2, 2, 2300);
insert into part values (9, 3, 9, 3, 1600);

insert into `replace`
	(origin_id, replace_id)
	values
	(3, 1);
insert into `replace`
	(origin_id, replace_id)
	values
	(3, 2);
insert into `replace`
	(origin_id, replace_id)
	values
	(6, 4);
insert into `replace`
	(origin_id, replace_id)
	values
	(6, 5);
insert into `replace`
	(origin_id, replace_id)
	values
	(9, 7);
insert into `replace`
	(origin_id, replace_id)
	values
	(9, 8);
