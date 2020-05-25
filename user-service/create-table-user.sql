CREATE DATABASE users;

USE users;

CREATE TABLE users(
id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
first_name VARCHAR(30) NOT NULL,
middle_name VARCHAR(30),
last_name VARCHAR(30),
email VARCHAR(200) NOT NULL UNIQUE,
phone VARCHAR(20) NOT NULL,
house_number VARCHAR(100) NOT NULL,
street VARCHAR(100) NOT NULL,
city VARCHAR(100) NOT NULL,
state VARCHAR(100) NOT NULL,
country VARCHAR(100) NOT NULL,
zip_code VARCHAR(6) NOT NULL,
username VARCHAR(200) NOT NULL UNIQUE,
password varchar (200) NOT NULL,
created_at int(11) NOT NULL,
updated_at int(11),
deleted_at int(11)
);

