-- 9. DISTINCT --

SELECT DISTINCT coffee_origin FROM products;

SELECT DISTINCT customer_id FROM orders
WHERE order_time BETWEEN '2017-02-01' AND '2017-02-28';

-- This isn't returning the same values, because the customers had ordered different products (product_id)
SELECT DISTINCT customer_id, product_id FROM orders
WHERE order_time BETWEEN '2017-02-01' AND '2017-02-28';