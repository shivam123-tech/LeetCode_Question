# Write your MySQL query statement below
select Distinct teacher_id,count(distinct subject_id) as cnt  from Teacher Group by teacher_id