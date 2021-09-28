-- 3. Add new Table column / Delete Table column --
USE coffee_store;
SELECT * FROM products;

ALTER TABLE products
ADD COLUMN coffee_origin VARCHAR(30);

ALTER TABLE products
DROP COLUMN coffee_origin;

-- 4. Delete Table --
DROP TABLE test;

-- 5. Truncate Table --
TRUNCATE TABLE test;