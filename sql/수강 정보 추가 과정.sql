-- 1. 과목 등록
insert into subject values('MSC001', '대학수학기초', 2, 2);
SELECT * FROM university.subject;
-- 2. 교수 등록
insert into professor 
	values(2020110001, '홍길동', '40', '010-1234-5678', '교수실 101호');
select * from professor;
-- 3. 강의 등록
insert into course
	values('2020_MSC001_1_1','강의실 101호','월1,2 수1,2',1,2020110001,'MSC001');
select * from course;
-- 4. 학생 등록
-- 5. 수강 등록
insert into attend(at_st_num, at_co_code)
	values(2020110012,'2020_MSC001_1_1');
select * from attend;

