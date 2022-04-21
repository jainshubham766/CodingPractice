Question: https://leetcode.com/problems/customers-who-never-order/

Solution: https://leetcode.com/problems/customers-who-never-order/discuss/1968370/Easy-or-Simple-or-Fast

 -- Approach 01: With Inner Select query
 
 -- select name as Customers  from Customers
 -- where id not in (select customerId from Orders)
    
  -- Approach 02:    With Left Join 
  
 -- select name as Customers  
 -- from Customers LEFT JOIN Orders 
 -- ON Customers.id = Orders.customerId
 -- where customerId is null;
