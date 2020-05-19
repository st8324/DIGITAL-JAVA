package day19;

import java.util.*;

public class TestEx3 {
	/* 아래 Student 클래스를 이용하여 학생 관리 프로그램을 만들려고 한다.
	 * 기능은 학생 정보 추가, 학생 정보 수정, 학생 정보 삭제가 있다.
	 * 이 때 필요한 메소드를 선언부만 정의하시오(구현 X)
	 * */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Student> list = new ArrayList<Student>();
		Student s;
		int menu = 0;
		do {
			printMenu();
			menu = scan.nextInt();
			switch(menu) {
			case 1:
				System.out.println("추가할 학생 정보를 입력하세요.");
				s = inputStudent(scan);
				if(!insertStudent(list, s)) {
					System.out.println("---이미 있는 학생 정보입니다---");
				}else {
					System.out.println("---학생 정보를 추가했습니다---");
				}
				break;
			case 2:
				System.out.println("수정할 학생 정보를 입력하세요.");
				s = inputStudent(scan);
				if(!modifyStudent(list, s)) {
					System.out.println("---없은 학생 정보입니다---");
				}else {
					System.out.println("---학생 정보를 수정했습니다.---");
				}
				break;
			case 3:
				System.out.println("삭제할 학생 정보를 입력하세요.");
				s = inputStudent(scan);
				if(!deleteStudent(list, s)) {
					System.out.println("---없은 학생 정보입니다---");
				}else {
					System.out.println("---학생 정보를 삭제했습니다.---");
				}
				break;
			case 4:
				printStudent(list);
				break;
			case 5:
				System.out.println("---프로그램을 종료합니다---");
				break;
			default:
				System.out.println("올바른 메뉴가 아닙니다.");
			}
		}while(menu != 5);
		
		scan.close();
	}
	private static void printMenu() {
		System.out.println("-------메뉴-------");
		System.out.println("1. 학생정보 추가");
		System.out.println("2. 학생정보 수정");
		System.out.println("3. 학생정보 삭제");
		System.out.println("4. 학생정보 출력");
		System.out.println("5. 프로그램 종료");
		System.out.println("-----------------");
		System.out.print("메뉴를 입력하세요 : ");
	}
	public static void printStudent(List<Student> list) {
		if(list == null || list.size() == 0)
			System.out.println("----학생 정보가 없습니다----");
		else {
			System.out.println("---학번------이름--전공-학년--");
			for(Student tmp : list) {
				System.out.println(tmp);
			}
		}
	}
	/* 기능 : Scanner를이용하여 학생 정보를 입력하면 학생 객체를 반환하는 메소드
	 * 매개변수 : Scanner scan 
	 * 리턴타입 : 학생 객체=> Student
	 * 메소드명 : inputStudent
	 * */
	public static Student inputStudent(Scanner scan) {
		Student s = new Student();
		System.out.print("학번 : ");
		String num = scan.next();
		System.out.print("학년 : ");
		String grade = scan.next();
		System.out.print("이름 : ");
		String name = scan.next();
		System.out.print("전공 : ");
		String major = scan.next();
		s.num = num;
		s.name = name;
		s.grade = grade;
		s.major = major;
		return s;
	}
	/* 기능 : 주어진 학생정보를 학생정보 리스트에 저장하는 메소드로 이미 있는 학생이면 저장하지 않고
	 *      없는 학생이면 저장
	 * 매개변수 : 학생정보 리스트, 주어진 학생정보 =>List<Student> list, Student s
	 * 리턴타입 : 저장 여부=> boolean
	 * 메소드명 : insertStudent
	 * */
	public static boolean insertStudent(List<Student> list, Student s) {
		//학생정보 리스트가 없거나, 학생정보가 없으면 추가할수 없기 때문에 실패
		if(list == null || s == null)
			return false;
		//이미 있는 학생인 경우 학생정보 리스트에 추가하지 못하기 때문에 실패
		if(list.contains(s))
			return false;
		//학생 정보 추가
		list.add(s);
		return true;
	}
	/* 기능 : 주어진 학생 정보를 학생정보 리스트에서 수정하는 메소드로 학생 정보가 없으면 수정 실패를
	 *      학생 정보가 있으면 수정 성공을 알려줌 
	 * 매개변수 : 학생정보리스트, 주어진 학생정보  =>List<Student> list, Student s
	 * 리턴타입 : 수정 여부=> boolean
	 * 메소드명 : modifyStudent
	 * */
	public static boolean modifyStudent(List<Student> list, Student s) {
		//list가 비거나 s가 비었으면 false
		if(list == null || s == null)
			return false;
		//list에 학생정보 s가 있는지 확인하여 없으면 false
		if(!list.contains(s))
			return false;
		//있으면 list에 있는 학생 s의 정보를 지우고, list에 학생 s의 정보를 추가 
		list.remove(s);
		list.add(s);
		return true;
	}
	/* 기능 : 주어진 학생 정보를 학생정보 리스트에서 삭제하는 메소드로 학생 정보가 없으면 삭제 실패를
	 *      학생 정보가 있으면 삭제 성공을 알려줌 
	 * 매개변수 : 학생정보리스트, 주어진 학생정보  =>List<Student> list, Student s
	 * 리턴타입 : 삭제 여부=> boolean
	 * 메소드명 : deleteStudent
	 * */
	public static boolean deleteStudent(List<Student> list, Student s) {
		//list가 비거나 s가 비었으면 false
		if(list == null || s == null)
			return false;
		//list에 학생정보 s가 있는지 확인하여 없으면 false
		if(!list.contains(s))
			return false;
		//있으면 list에 있는 학생 s의 정보를 지움 
		list.remove(s);
		return true;
	}
}
class Student{
	String name;//이름
	String num;//학번 => 고유번호(중복 x)
	String major;//전공
	String grade;//학년
	public Student() {}
	public Student(String name, String num, String major, String grade) {
		super();
		this.name = name;
		this.num = num;
		this.major = major;
		this.grade = grade;
	}
	@Override
	public String toString() {
		return num + " " + name + " " + " " + major + "   " + grade;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((num == null) ? 0 : num.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (num == null) {
			if (other.num != null)
				return false;
		} else if (!num.equals(other.num))
			return false;
		return true;
	}
}