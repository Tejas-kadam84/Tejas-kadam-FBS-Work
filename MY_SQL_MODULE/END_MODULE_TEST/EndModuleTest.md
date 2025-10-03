# Test 1:- Set B





#### FRN NO = 021





###### Q1. Ans

select customer name

from customer

order by customer name;



###### Q2. Ans

select \*

from Products

order by price desc

limit 10;



###### Q3. Ans

select max(salary)

from Employees

where salary < max(salary);



###### Q4. Ans

select city, count(\*)

from customer

group by city;



###### Q5. Ans

select department, sum(salary)

from Employees

group by department

having sum(salary) > 200000;



###### Q6. Ans

SELECT substring(phone\_number, -4),

substring(customerName, 1, 3)

from Customers;



###### Q7. Ans

select \*from products

where product\_name like '%pro%';





###### Q8. Ans

SELECT course, count(\*)

from Students

group by course

having count(\*) >= 30;



###### Q9. Ans

select month(order\_date) ,count(\*)

from Orders

group by month(order\_date)

order by order\_month;



###### Q10. Ans

select department max(salary), min(salary)

from employees

group by department;





###### Q11. Ans

A)



###### Q12. Ans

A)



###### Q13. Ans

A)



###### Q14. Ans

B)



###### Q15. Ans

B)



###### Q16. Ans

select c.customer\_id,customer\_name,avg(total\_amount) from orders o

inner join customers c

on c.customer\_id=o.customers\_id

group by customer\_name;



###### Q17. Ans

select c.customer\_id,customer\_name,count(\*)as "no of orders",avg(total\_amount) from orders o

inner  join  customers c

on c.customer\_id=o.customers\_id

group by customer\_name

having COUNT(\*) > 2;



