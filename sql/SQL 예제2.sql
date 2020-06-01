-- select 속성 
-- 	from 테이블A
-- 		join 테이블B
-- 			on 테이블A.속성A = 테이블B.속성B
--         join 테이블C
-- 			on 테이블A.속성A = 테이블C.속성C
-- 	where 조건;

-- 홍길동 교수님의 모든 지도학생의 이름을 확인하기 위한 SQL문을 작성하세요.
select pr_name, st_name 
	from coach
		join professor
			on pr_num = ch_pr_num
		join student
			on st_num = ch_st_num
	where pr_name = '홍길동';

select pr_name, st_name 
	from coach
		join (select * from professor where pr_name = '홍길동') as pr
			on pr_num = ch_pr_num
		join student
			on st_num = ch_st_num;

-- 홍길동 교수님이 강의하거나 했던 모든 과목명을 확인하는 SQL문
-- 폐강인 경우는 강의 테이블에서 해당 강의를 삭제한다는 조건의 시스템
select pr_name, su_title, co_code
	from course
		join (select * from professor where pr_name = '홍길동') as pr
			on pr_num = co_pr_num
		join subject
			on su_num = co_su_num;
-- 홍길동 교수님이 2020년 1학기에 강의하는 모든 과목명을 확인하는 SQL문
-- 폐강인 경우는 강의 테이블에서 해당 강의를 삭제한다는 조건의 시스템
-- 2020#_%#_1%로 조건을 걸면 다음과 같은 경우에 검색되서 잘못됨 => 2020_MSC001_2_1
-- 2020#_%#_1_%로 조건을 걸면 _1다음에 1글자 이상이 필요해서 해결 됨
select pr_name, su_title, co_code
	from (select * from course where co_code like '2020#_%#_1_%' escape '#') as co
		join (select * from professor where pr_name = '홍길동') as pr
			on pr_num = co_pr_num
		join subject
			on su_num = co_su_num;
select pr_name, su_title, co_code
	from course
		join professor
			on pr_num = co_pr_num
		join subject
			on su_num = co_su_num
	where pr_name = '홍길동' and co_code like '2020#_%#_1_%' escape '#';

-- 홍길동 교수가 하거나 했던 강의 이름을 중복된 강의 명은 제거
select pr_name, su_title
	from course
		join (select * from professor where pr_name = '홍길동') as pr
			on pr_num = co_pr_num
		join subject
			on su_num = co_su_num
	group by su_title;

-- 정렬 : order by 속성 ASC(오름차순)/DESC(내림차순)
select * from attend order by at_num desc;




    