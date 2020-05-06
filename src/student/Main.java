package student;

public class Main {

	public static void main(String[] args) {
		Student s = new Student();
		s.setScore(new Subject("국어",40,40,10,10),
				new Subject("영어",30,10,10,10),
				new Subject("수학",20,20,10,10));
		s.printScore();
	}
}
/* 1. 데이터 관리를 위한 작업
 *   => 변수나 클래스를 이용
 *   학생 정보=>Student 클래스
 *   과목 정보=>Subject 클래스
 * 2. 기능 구현
 *   => main메소드에 바로 구현
 * 	 => 또는 기능을 인터페이스로 정의하고, 해당 인터페이스를 구현하는 구현 클래스
 * 3. 테스트
 * */
interface Manage{
	public int insertStuent(Student []arr, Student std);
	public void modifyStuent(Student []arr, Student std);
	public int deleteStuent(Student []arr, Student std);
	public void printStuent(Student []arr,int count);
}

