-- create a table
CREATE TABLE client (
                        id int PRIMARY KEY,
                        name varchar(100) NOT NULL,
                        email varchar(70),
                        fone varchar(20),
                        city varchar(100),
                        uf varchar(2)
);
-- insert values in table client
insert into client values (1, "Macaco1", "macaco123@gmail.com", "11999999999", "São Paulo", "SP");
insert into client values (2, "Macaco2", "macaco123@gmail.com", "11999999999", "São Paulo", "SP");
insert into client values (3, "Macaco3", "macaco123@gmail.com", "11999999999", "São Paulo", "SP");
insert into client values (4, "Macaco4", "macaco123@gmail.com", "11999999999", "São Paulo", "SP");

-- select from client
-- select id, name, fone, city, uf from client where id = 3;

-- update client
-- update client set name = "Macaco22", city = "Lua", uf = "LN" where id = 2;
-- select * from client where id = 2;

-- comando update sem where PARA NÂO SER FEITO!!!
update client set name = "Macaco22", city = "Lua", uf = "LN";

select * from client;

-- delete client

delete from client where id = 4;