package student;

public class Subject {
	private String title;
	private int midterm;
	private int finals;
	private int performance;
	private int attendance;
	
	public void print() {
		System.out.println("----"+title+"성적----");
		System.out.println("중간고사 : " + midterm);
		System.out.println("기말고사 : " + finals);
		System.out.println("수행평가 : " + performance);
		System.out.println("출석점수 : " + attendance);
		System.out.println("--------------");
	}
	public Subject(String title, int midterm, int finals, int performance, int attendance) {
		super();
		this.title = title;
		this.midterm = midterm;
		this.finals = finals;
		this.performance = performance;
		this.attendance = attendance;
	}

	public Subject(Subject subject) {
		midterm = subject.midterm;
		finals = subject.finals;
		performance = subject.performance;
		attendance = subject.attendance;
		title = subject.title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getMidterm() {
		return midterm;
	}

	public void setMidterm(int midterm) {
		this.midterm = midterm;
	}

	public int getFinals() {
		return finals;
	}

	public void setFinals(int finals) {
		this.finals = finals;
	}

	public int getPerformance() {
		return performance;
	}

	public void setPerformance(int performance) {
		this.performance = performance;
	}

	public int getAttendance() {
		return attendance;
	}

	public void setAttendance(int attendance) {
		this.attendance = attendance;
	}
	
	
}
