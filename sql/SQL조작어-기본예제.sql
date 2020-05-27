/* student 테이블안에 있는 모든 행들의 st_num와 
st_name의 값들을 확인하기 위한 SQL문을 작성하세요. */
select st_num, st_name from university.student;
/* student 테이블안에 있는 모든 행들의 모든 속성 값들을 
확인하기 위한 SQL문을 작성하세요. */
select st_num, st_name, st_identification_num, st_type 
from university.student;
select * from university.student;

insert into 
student(st_num, st_name, st_identification_num, st_type)
values(2020110011,'홍길동','010101-3123456','학사');

select * from student;

/* 학번이 2020110013인 학생의 이름을 유관순으로 수정하도록 SQL을 작성하세요.*/
delete from student where st_type='석사';
select * from student;
