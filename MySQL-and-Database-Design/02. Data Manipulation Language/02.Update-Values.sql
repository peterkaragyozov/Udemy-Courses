-- 2. Update Values --

SELECT * FROM products;


SET SQL_SAFE_UPDATES = 0;
-- when updating MySQL permits by default WHERE to be only the column that is a Primary Key, 
-- thus we have to set it to be equal to 0 (False). Alternatively we set it to 1 (True) --

UPDATE products
SET coffee_origin = 'India'
WHERE id = 7;

UPDATE products
SET price = 3.25, coffee_origin = 'Ethiopia'
WHERE name = 'Americano';

UPDATE products
SET coffee_origin = 'Columbia'
WHERE coffee_origin = 'Brazil' ;