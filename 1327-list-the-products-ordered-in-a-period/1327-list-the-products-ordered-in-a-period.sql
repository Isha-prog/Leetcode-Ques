# Write your MySQL query statement below
select  p.product_name ,sum(o.unit) as unit
from orders o
left join products p
on o.product_id=p.product_id
where year(order_date) =2020
and month(order_date)=2
group by p.product_id,p.product_name
having sum(o.unit)>=100

