# Write your MySQL query statement below
select w1.id from weather as w1 inner join weather as w2 where Datediff(w1.recordDate, w2.recordDate) = 1 AND w1.temperature > w2.temperature;