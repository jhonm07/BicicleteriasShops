create table (
id serial,
name_shops varchar(40),
latitud double (60),
longitud double(60),
constraint shops_pk primary key(id));)

create table biker_shops(
name varchar(30),
document numeric(15),
login varchar(30),
password varchar(30),
mail varchar(40),
phone numeric (15),
id serial,
constraint biker_pk primary key(id));


