-- 1. Create and Delete Database--

SHOW DATABASES;
CREATE DATABASE test;
USE test;
SHOW TABLES;
DROP DATABASE test;

-- 2. Create Tables --

SHOW DATABASES;
CREATE DATABASE coffee_store;
USE coffee_store;
CREATE TABLE products(
	id INT AUTO_INCREMENT PRIMARY KEY,
	name VARCHAR(30),
	price DECIMAL(3,2) -- 3 is the total number of allowed digits, 2 is the number of digits after the decimal comma
);

CREATE TABLE customers(
	id INT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(30),
    last_name VARCHAR(30),
    gender ENUM('M', 'F'),
    phone_number VARCHAR(11)
);

CREATE TABLE orders(
	id INT AUTO_INCREMENT PRIMARY KEY,
    product_id INT,
    customer_id INT,
    order_time DATETIME,
    FOREIGN KEY (product_id) REFERENCES products(id),
    FOREIGN KEY (customer_id) REFERENCES customers(id)
);

SHOW TABLES;
