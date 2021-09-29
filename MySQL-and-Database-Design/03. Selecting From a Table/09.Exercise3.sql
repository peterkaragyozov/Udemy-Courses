-- Exercise 3 Solution --

SELECT DISTINCT last_name FROM customers
ORDER BY last_name;

SELECT * FROM orders
WHERE order_time BETWEEN '2017-02-01' AND '2017-02-28'
AND customer_id = 1
ORDER BY order_time
LIMIT 3;

SELECT name, price AS retail_price, coffee_origin FROM products;