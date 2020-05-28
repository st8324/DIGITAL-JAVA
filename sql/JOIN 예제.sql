-- join은 두 테이블을 연결하여 하나의 테이블을 만듬
-- 두 테이블을 연결해주는 연결고리에 해당하는 부분이 on 다음에 나오는 코드
-- on을 통해 연결할 때 테이블A와 테이블 B에 연결하는 속성명이 서로 다른 경우
-- 테이블명을 생략할 수 있다
-- 여러개의 테이블을 join으로 연결할 때, 테이블 연결 순서에 따라 join 속도가 달라진다.
select 속성 
	from 테이블A 
		join 테이블B 
        on 테이블A.속성명 = 테이블B.속성명
	where 조건;
select * from course;
-- 강의를 하는 교수명을 확인하기 위한 SQL
select co_code, pr_name 
	from course
		join professor
        on pr_num = co_pr_num;
-- 강의의 과목명을 확인하기 위한 SQL
select co_code, su_title 
	from course
		join subject
        on su_num = co_su_num;
-- 강의의 과목명과 교수를 확인하기 위한 SQL
select co_code, pr_name, su_title
	from course
		join professor
        on pr_num = co_pr_num
        join subject
        on su_num = co_su_num;
        
-- 학생이름과 지교수의 이름이 출력되도록 SQL문을 작성하세요.
select st_name, pr_name 
	from coach
    join student
    on ch_st_num = st_num
    join professor
    on ch_pr_num = pr_num;

-- 임꺽정 학생이 수강했거나 하고 있는 과목을 출력하는 SQL문을 작성하세요.
select st_name, su_title, su_point
	from attend
		join student
        on at_st_num = st_num
        join course
        on at_co_code = co_code
        join subject
        on co_su_num = su_num
	where st_name = '임꺽정';
    
select st_name, su_title 
	from attend
		-- student 테이블에서 이름이 임꺽정인 학생을 검색하여 검색 결과를 st라는 임시 테이블로 생성
        -- MySQL에서는 서브 쿼리 결과에 이름을 안붙이면 에러 발생. 
        -- 오라클은 서브 쿼리에 이름을 안붙여도 가능
		join (select * from student where st_name='임꺽정') as st
        on at_st_num = st_num
        join course
        on at_co_code = co_code
        join subject
        on co_su_num = su_num;
-- 현재(2020년 1학기) 개설된 과목명을 볼수 있도록 SQL문을 작성하세요.
select co_code, su_title 
	from (select * from course where co_code like '2020@_%@_1@_%' escape '@') as t
		join subject
        on co_su_num = su_num;
        
-- 임꺽정 학생이 현재까지 수강했거나 수강하고 있는 과목의 총 학점을 출력하도록 SQL문을 작성하세요.
select st_name, sum(su_point)
	from attend
		join (select * from student where st_name='임꺽정') as st
        on at_st_num = st_num
        join course
        on at_co_code = co_code
        join subject
        on co_su_num = su_num;

-- 수강기록에서 총점을 확인하는 SQL문
select at_co_code as '강의코드', at_st_num as '학번', 
	(at_mid+at_final+at_homework+at_attendance) as 총점 from attend;

-- 2020년 1학기에 대학수학기초 강의 1분반 학생의 수를 확인하는 SQL문
select su_title as '과목명', count(*) as '학생 수(명)'
	from (select * from attend where at_co_code like '2020@_%@_1@_%' escape '@') as t1
		join course
        on co_code = at_co_code
        join (select * from subject where su_title = '대학물리') as t2
        on su_num = co_su_num; 

-- 홍길동 학생이 작성한 게시글을 확인하는 SQL문
select bo_title, st_name from board
	join (select * from student where st_name = '홍길동') as t
    on bo_st_num = st_num;

