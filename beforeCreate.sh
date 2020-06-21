#!/bin/bash
drop="drop database neuropsi;"
create="create database neuropsi;"
statement="$drop$create"
mysql --user=vemm --password=abc123?? -e "$statement"
mvn clean install -DskipTests
mvn spring-boot:run
#drop database neuropsi
#create database neuropsi
