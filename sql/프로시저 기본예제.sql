/*
트리거 : 이벤트가 발생되면 자동 실행
프로시저 : 필요할 때 호출, 함수
*/
/*
drop procedure if exists 프로시저명;
delimiter //
create procedure 프로스저명(
	in 매개변수 자료형,
    in 매개변수 자료형,
    out 리턴변수 자료형,
    out 리턴변수 자료형
)
begin
end//
delimiter ;
*/
# 학번이 주어지면 주어진 학번의 학생 이름을 반환하는 프로시저
drop procedure if exists select_student;
delimiter //
create procedure select_student(
	in student_num int ,
    out student_name varchar(40)
)
begin
	set student_name = (select st_name from student where st_num = student_num);
end//
delimiter ;
# @변수는 한번선언되면 끝까지 사용할 수 변수
call select_student(2015110001, @student_name);
select @student_name;
SELECT * FROM university.course;

