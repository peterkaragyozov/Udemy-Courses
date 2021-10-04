-- 2. LEFT JOIN --

/*
The UPDATE clause breaks the relation for the first entry to show the significance when using LEFT/RIGHT JOIN regarding 
which table is going to be chosen as Table 1 and which - as Table 2
*/

UPDATE orders
SET customer_id = NULL
WHERE id = 1;

SELECT o.id, c.phone_number, c.last_name, o.order_time FROM orders o 
LEFT JOIN customers c ON o.customer_id = c.id
ORDER BY o.order_time
LIMIT 10;

SELECT o.id, c.phone_number, c.last_name, o.order_time FROM customers c 
LEFT JOIN orders o ON c.id = o.customer_id
ORDER BY o.order_time
LIMIT 10;