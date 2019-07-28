# spring3.1-lab

## DB

CREATE DATABASE spring31db;
create user 'spring31'@'localhost' identified by 'spring31';
grant all privileges on *.* to 'spring31'@'localhost';
grant all privileges on spring31db.* to 'spring31'@'localhost';
