# Write your MySQL query statement below
select  students.student_id,student_name,subjects.subject_name ,ifnull(count(examinations.student_id),0) 
attended_exams from students cross join Subjects left join examinations on students.student_id=examinations.student_id
 and examinations.subject_name=subjects.subject_name group by students.student_id,student_name,subjects.subject_name 
 order by students.student_id,subjects.subject_name;
