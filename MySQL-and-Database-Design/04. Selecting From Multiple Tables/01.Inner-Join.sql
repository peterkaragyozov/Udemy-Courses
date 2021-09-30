-- 1. INNER JOIN --

SELECT products.name, orders.order_time FROM orders
INNER JOIN products ON orders.product_id = products.id;

-- This is a shorthand statement for the query above
SELECT p.name, o.order_time FROM orders o
JOIN products p ON o.product_id = p.id;

-- INNER JOIN with WHERE and ORDER BY clauses
SELECT p.name, p.price, o.order_time FROM orders o
JOIN products p ON o.product_id = p.id
WHERE o.product_id = 5
ORDER BY o.order_time;