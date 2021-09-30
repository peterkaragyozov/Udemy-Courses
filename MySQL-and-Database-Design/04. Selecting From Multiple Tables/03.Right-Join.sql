-- 3. RIGHT JOIN --

--The same as LEFT JOIN, but opposite
SELECT o.id, c.phone_number, c.last_name, o.order_time FROM customers c 
RIGHT JOIN orders o ON c.id = o.customer_id
ORDER BY o.order_time
LIMIT 10;

SELECT o.id, c.phone_number, c.last_name, o.order_time FROM orders o 
RIGHT JOIN customers c ON o.customer_id = c.id
ORDER BY o.order_time
LIMIT 10;