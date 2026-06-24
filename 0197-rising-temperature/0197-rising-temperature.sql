# Write your MySQL query statement below
select w.id
from weather w
join weather m
on DATEDIFF(w.recordDate,m.recordDate)=1

where w.temperature>m.temperature