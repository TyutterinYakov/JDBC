create table users(
	user_id SERIAL,
	user_name varchar(20) not null,
	age int not null,
	email varchar(64) not null


);



insert into users(user_name, age, email) values
('Yasha', 20, 'tyutterin_yahsa@mail.ru'),
('Sasha', 19, 'sasha@mail.ru'),
('Armen', 27, 'arm3232@mail.ru');
