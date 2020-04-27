package day7;

public class ClassEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.in();
		s1.printInfo();
		Student s2 = new Student("디지털 컨버전스 ... 자바","이순신");
		s2.in();
		s2.out();
		s2.printInfo();
	}

}

class Student{
	//멤버 변수
	//학생 이름
	private String name;
	//입실여부
	private boolean isEntrance;
	//수강 과정
	private String course;
	//입실시간, 퇴실시간
	private String inTime, outTime;
	
	//멤버 메서드
	//입/퇴실 기능
	public void in() {
		System.out.println(name + "님이 입실 했습니다.");
		isEntrance = true;
		inTime = "9시";
	}
	public void out() {
		System.out.println(name + "님이 퇴실 했습니다.");
		isEntrance = false;
		outTime = "18시";
	}
	//학생정보 출력 기능
	public void printInfo() {
		System.out.println("과정 : " + course);
		System.out.println("이름 : " + name);
		if(isEntrance) {
			System.out.println("입실 중입니다.");
			System.out.println("입실 시간 : " + inTime);
		}else {
			System.out.println("퇴실 했습니다.");
			System.out.println("입실 시간 : " + inTime);
			System.out.println("퇴실 시간 : " + outTime);
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isEntrance() {
		return isEntrance;
	}
	public void setEntrance(boolean isEntrance) {
		this.isEntrance = isEntrance;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getInTime() {
		return inTime;
	}
	public void setInTime(String inTime) {
		this.inTime = inTime;
	}
	public String getOutTime() {
		return outTime;
	}
	public void setOutTime(String outTime) {
		this.outTime = outTime;
	}
	
	//생성자
	public Student() {
		course = "자바";
		name = "홍길동";
	}
	public Student(String course, String name) {
		this.course = course;
		this.name = name;
	}
}



