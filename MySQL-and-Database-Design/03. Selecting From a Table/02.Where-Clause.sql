-- 2. Where Clause --
SELECT * FROM products
WHERE coffee_origin = 'Columbia'
AND price = 5.00
AND name = 'Macchiato';

SELECT * FROM products
WHERE coffee_origin = 'Indonesia'
OR name = 'Macchiato';

-- 3. Inequality Symbols --
SELECT * FROM products
WHERE price >= 3.00;

-- 4. Null Values --
SELECT * FROM customers
WHERE phone_number IS NULL;

SELECT * FROM customers
WHERE phone_number IS NOT NULL;

-- 5. IN / NOT IN --
SELECT * FROM customers
WHERE last_name IN ('Taylor', 'Bluth', 'Armstrong');

SELECT * FROM customers
WHERE first_name NOT IN ('Kathie', 'John', 'George');

-- 6. BETWEEN --
SELECT product_id, customer_id, order_time FROM orders
WHERE order_time BETWEEN '2017-01-01' AND '2017-01-07';

SELECT product_id, customer_id, order_time FROM orders
WHERE customer_id BETWEEN 5 AND 10;

SELECT * FROM customers
WHERE last_name BETWEEN 'A' and 'L';

-- 7. LIKE --
-- This will return all last names that start with W
SELECT * FROM customers
WHERE last_name LIKE 'W%';

-- This will return all last names that have O somewhere in them
SELECT * FROM customers
WHERE last_name LIKE '%O%';

-- This will return all last names that end with W
SELECT * FROM customers
WHERE last_name LIKE '%W';

-- This will return all first names that have only one character before O and one character after it
SELECT * FROM customers
WHERE first_name LIKE '_O_';

-- This will return all prices that start with 3
SELECT * FROM products
WHERE price LIKE '3%';