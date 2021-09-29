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
