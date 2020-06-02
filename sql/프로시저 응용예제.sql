/*
과목 코드, 강의년도, 강의학기, 분반, 강의실, 강의시간, 교수번호가 주어졌을 때
새로운 강의를 등록하는 프로시저를 작성하세요.
*/
drop procedure if exists insert_course;
delimiter //
create procedure insert_course(
	in subject_code varchar(6) , 	#과목코드
    in course_year int , 			#강의년도
    in course_seasion int,			#강의학기
    in course_class int,			#강의분반
    in course_room varchar(15),		#강의실
    in course_time varchar(30),		#강의시간
    in professor_num int			#교수번호
)
begin
	declare _code varchar(16);
    # 2015_MSC001_1_1
	set _code 
		= concat(course_year,'_',subject_code,'_',course_seasion,'_',course_class);
    # 학기는 1학기,2학기,여름학기(3),계절학기(4)로 되어 있음
    if course_seasion >= 1 and course_seasion <= 4
		# subject_code와 일치하는 과목이 있으면 => 외래키의 값으로 상대방의 기본키값이 없을 때
		and (select count(*) from subject where su_num = subject_code) != 0
        # professor_num와 일치하는 교수가 있으면 => 외래키의 값으로 상대방의 기본키값이 없을 때
		and (select count(*) from professor where pr_num = professor_num) != 0
        # 학기가 교수번호보다 빠른 경우 예: 2015학기인데 2020학번인 교수가 강의하려는 경우
        and convert(professor_num / 1000000,signed integer) <= course_year
        # 강의코드 중복되지 않으면 => 기본키가 이미 있는 경우
        and (select count(*) from course where co_code = _code) = 0
    then
		insert into course
			values(_code,course_room,course_time,course_class,professor_num,subject_code);
    end if;
end//
delimiter ;
call insert_course('MSC001', 2020, 2, 3, '강의실 301호', '월1,2',2020110004);
select * from course;
select 2020110110 / 1000000;