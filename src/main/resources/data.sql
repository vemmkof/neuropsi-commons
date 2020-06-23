/*USERS*/
--ADMIN
insert into user
(name, last_name, second_last_name, date_of_birth, gender, username, password, phone, role, enabled)
values ('Victor Edgar', 'Mujica', 'Marquez', '1996-01-30', 'MALE',
'admin@gmail.com', '$2a$04$rsenc.t.gmdEVV9DmYmvsecQzrwtDoszvvebUi/zG9Ee0FIp.a6b.', '5541105221', 'ADMINISTRATOR', 1);
--SPECIALIST
insert into user
(name, last_name, second_last_name, date_of_birth, gender, username, password, phone, role, enabled)
values ('Victor Edgar', 'Mujica', 'Marquez', '1996-01-30', 'MALE',
'specialist@gmail.com', '$2a$04$rsenc.t.gmdEVV9DmYmvsecQzrwtDoszvvebUi/zG9Ee0FIp.a6b.', '5541105221', 'SPECIALIST', 1);
--PATIENT
insert into user
(name, last_name, second_last_name, date_of_birth, gender, username, password, phone, role, enabled)
values ('Victor Edgar', 'Mujica', 'Marquez', '1996-01-30', 'MALE',
'patient@gmail.com', '$2a$04$rsenc.t.gmdEVV9DmYmvsecQzrwtDoszvvebUi/zG9Ee0FIp.a6b.', '5541105221', 'PATIENT', 1);
/*INSTITUTE*/
insert into institute(name, address, phone)
values ('IPN-ESCOM', 'Av. Juan de Dios Bátiz S/N, Nueva Industrial Vallejo, Gustavo A. Madero, 07738 Ciudad de México, CDMX', '55 5729 6000');
/**/