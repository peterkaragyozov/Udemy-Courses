-- 9. Rename Column name --
SELECT * FROM pets;

ALTER TABLE pets CHANGE `species` `animal_type` VARCHAR(20);

-- 10. Change Column Data Type --
ALTER TABLE addresses MODIFY city VARCHAR(30);

DESCRIBE addresses;