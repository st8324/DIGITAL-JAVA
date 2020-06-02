# 2015110001 학번 학생이 지금까지 이수한 학점을 출력하는 SQL문
select sum(su_point) as 이수학점
	from attend
		join course
			on co_code = at_co_code
		join subject
			on su_num = co_su_num
	where at_st_num = 2015110001 and at_complete = 'Y';