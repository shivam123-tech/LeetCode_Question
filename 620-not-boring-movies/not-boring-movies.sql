# Write your MySQL query statement below
select * from cinema where  (id in(1,3,5,7,9) and description != "boring") order by rating Desc;
