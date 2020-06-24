/*USERS*/
--ADMIN
insert into user(name, last_name, second_last_name, date_of_birth, gender, username, password, phone, role, enabled)
values ('ADMINISTRADOR', 'NEUROPSI', 'ESCOM', '1996-01-30', 'MALE',
'admin@gmail.com', '$2a$04$rsenc.t.gmdEVV9DmYmvsecQzrwtDoszvvebUi/zG9Ee0FIp.a6b.', '55 6677 8899', 'ADMINISTRATOR', 1);
--SPECIALIST
insert into user(name, last_name, second_last_name, date_of_birth, gender, username, password, phone, role, enabled)
values ('SPECIALIST', 'NEUROPSI', 'ESCOM', '1996-01-30', 'MALE',
'specialist@gmail.com', '$2a$04$rsenc.t.gmdEVV9DmYmvsecQzrwtDoszvvebUi/zG9Ee0FIp.a6b.', '55 6677 8899', 'SPECIALIST', 1);
--PATIENT
insert into user(name, last_name, second_last_name, date_of_birth, gender, username, password, phone, role, enabled)
values ('PATIENT', 'NEUROPSI', 'ESCOM', '1996-01-30', 'MALE',
'patient@gmail.com', '$2a$04$rsenc.t.gmdEVV9DmYmvsecQzrwtDoszvvebUi/zG9Ee0FIp.a6b.', '55 6677 8899', 'PATIENT', 1);
/*INSTITUTE*/
insert into institute(name, address, phone)
values ('IPN-ESCOM', 'Av. Juan de Dios Bátiz S/N, Nueva Industrial Vallejo, Gustavo A. Madero, 07738 Ciudad de México, CDMX', '55 5729 6000');
/*DISEASE*/
insert into disease(description) values ('HIPERTENSIÓN');
insert into disease(description) values ('DAÑO PULMONAR');
insert into disease(description) values ('ALCOHOLISMO');
insert into disease(description) values ('DEPENDENCIA A DROGAS');
insert into disease(description) values ('DEBILIDAD VISUAL');
insert into disease(description) values ('AGUDEZA AUDITIVA');
insert into disease(description) values ('TRAUMA CRANEOCEREBRAL');
insert into disease(description) values ('DIABETES');
insert into disease(description) values ('TIROIDISMO');
insert into disease(description) values ('DAÑOS CEREBROVASCULARES');