#!/bin/bash
drop="drop database neuropsi;"
create="create database neuropsi;"
statement="$drop$create"
clear && mysql --user=vemm --password=abc123?? -e "$statement"
mvn clean spring-boot:run
