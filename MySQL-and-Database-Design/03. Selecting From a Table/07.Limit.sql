-- 10. LIMIT --
SELECT * FROM customers
LIMIT 5;

-- Returns 5 results after the 15th value
SELECT * FROM customers
LIMIT 5 OFFSET 15;

SELECT * FROM customers
ORDER BY last_name
LIMIT 10;