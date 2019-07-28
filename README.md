# spring3.1-lab

## DB

Create Database & User

	CREATE DATABASE spring31db;
	create user 'spring31'@'localhost' identified by 'spring31';
	grant all privileges on *.* to 'spring31'@'localhost';
	grant all privileges on spring31db.* to 'spring31'@'localhost';

Create Table

	CREATE TABLE USERS(
	   user_id varchar(10) primary key,
       user_name varchar(20) not null,
       user_password varchar(20) not null
	);

