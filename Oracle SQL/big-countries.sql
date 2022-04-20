Question: https://leetcode.com/problems/big-countries/

Solution: https://leetcode.com/problems/big-countries/discuss/103561/Union-and-OR-and-the-Explanation


/* Write your PL/SQL query statement below */

        -- Approach 01: Using OR Operator
 SELECT name, population, area
 FROM World
 Where (area >= 3000000 ) OR (population >=25000000);


            -- Approach 02:  Using UNION Operator --faster than OR
 SELECT name, population, area
 FROM World
 Where (area >= 3000000 )

 UNION

 SELECT name, population, area
 FROM World
 Where (population >=25000000);
