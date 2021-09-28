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
