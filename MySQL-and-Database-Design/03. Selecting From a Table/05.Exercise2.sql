-- Exercise 2 Solution --

SELECT name, price FROM products
WHERE coffee_origin IN ('Columbia', 'Indonesia')
ORDER BY name;

SELECT * FROM orders
WHERE order_time BETWEEN '2017-02-01' AND '2017-02-28'
AND customer_id IN (2, 4, 6, 8);

SELECT first_name, phone_number FROM customers
WHERE last_name LIKE '%ar%';