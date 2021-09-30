-- Exercise 1 Solution --

SELECT o.id, c.phone_number FROM orders o
JOIN customers c ON o.customer_id = c.id
WHERE o.product_id = 4;

SELECT p.name, o.order_time FROM products p 
JOIN orders o ON p.id = o.product_id
WHERE p.name = 'Filter'
AND o.order_time BETWEEN '2017-01-15' AND '2017-02-14';

SELECT p.name, p.price, o.order_time FROM products p 
JOIN orders o ON p.id = o.product_id
JOIN customers c ON o.customer_id = c.id
WHERE c.gender = 'F'
AND o.order_time BETWEEN '2017-01-01' AND '2017-01-31';