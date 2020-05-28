-- 등록된 학생들의 학번과 이름이 출력(검색)되도록 SQL문을 작성하세요.
SELECT st_num, st_name FROM student;
-- 등록된 학생들 중에서 학번이 2020110011인 학생의 모든 정보를 출력하는
-- SQL문을 작성하세요.(테이블에 2020110011 학생이 없어도 상관없음)
SELECT * FROM student WHERE st_num = 2020110011;
-- 등록된 학생들 중에서 학번이 2020110011이 아닌 모든 학생의 모든 정보를 
-- 출력하는 SQL문을 작성하세요.(테이블에 2020110011 학생이 없어도 상관없음)
SELECT * FROM student WHERE st_num != 2020110011;
SELECT * FROM student WHERE st_num <> 2020110011;
-- 2019학번 학생을 등록하는 SQL문을 작성하세요.학번, 이름, 주민번호, 분류는
-- 임의로 입력
INSERT INTO student(st_num, st_name, 
	student.st_identification_num)
    VALUES(2019110001,'장보고','000505-1234567');
SELECT * FROM student;
-- 2020학번 학생들만 출력되도록 SQL문을 작성하세요.
SELECT * FROM student WHERE st_num >= 2020000000;
