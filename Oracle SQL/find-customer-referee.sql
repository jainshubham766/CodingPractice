Question:  https://leetcode.com/problems/find-customer-referee/

/* Write your PL/SQL query statement below */

 SELECT name  
 FROM Customer
 --Where (referee_id != 2 ) OR(referee_id is null ) ;
 Where (referee_id <> 2 ) OR(referee_id is null ) ;

