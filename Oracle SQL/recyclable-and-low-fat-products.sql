Question : https://leetcode.com/problems/recyclable-and-low-fat-products/

Solution: https://leetcode.com/problems/recyclable-and-low-fat-products/discuss/1967721/SQL-or-MySQL-or-Oracle-Simple-Approach-With-AND-INTERSECT-operator



--Approach 01: Using AND Operator

 SELECT product_id
 FROM Products
 Where (low_fats = 'Y' ) AND (recyclable = 'Y');

--Approach 02: Using INTERSECT Operator --Slower than OR

 SELECT product_id
 FROM Products
 Where (low_fats = 'Y' )

INTERSECT

 SELECT product_id
 FROM Products
 Where (recyclable = 'Y');
