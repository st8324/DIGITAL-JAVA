package day17;

import java.util.*;

public class VariableEx2 {
	/* 객체 멤버 변수 : 대부분의 사용자 클래스의 멤버 변수는 객체 멤버 변수이다.
	 * 클래스 멤버 변수 : 동일한 클래스의 모든 객체들이 공유하는 정보가 있다면 클래스 멤버 변수로 한다.
	 * 멤버변수(클래스,객체) : 의미있는 정보를 클래스 안에 선언할 때 사용하는 변수,
	 * 					  해당 정보가 메소드 곳곳에서 사용할 때
	 * 지역 변수 : 메소드를 실행하는데 있어서 자체적으로 사용하는 변수
	 *          외부에서 알려주는 정보와 상관없음
	 * 매개 변수 : 메소드에서 기능을 실행하는데 있어 필요한 정보
	 * 			메소드 안에서 매개변수 = 값; 과 같은 코드가 발생한다면 해당 매개변수는
	 * 			지역변수로 바꿔도 되는 매개변수이다.
	 * */

	public static void main(String[] args) {
		Corona c1 = new Corona();
		List<Corona> list = new ArrayList<Corona>();
		list.add(c1);
		Corona c2 = new Corona();
		list.add(c2);
		System.out.println(Corona.cnt);
		System.out.println(list.size());
	}
}
class ClassRoom{
	int cnt = 0;//강의장의 학생 수
	int maxCnt = 20;//강의장 정원
	String clasNum = "401호";//강의장 번호
	List<String> courseNameList = new ArrayList<String>();//해당 강의장의 강의 리스트
	//int i = 0;//메소드에서 반복문을 이용할 때 사용할 변수 => 멤버 변수로 만드는 것은 부적절
}
class GreenArtClassRoom extends ClassRoom{
	static String companyName = "그린 컴퓨터 아트 학원";
}

class Corona{
	String name;//환자 이름
	String address;//환자 주소
	static int cnt;//현재까지 누적 환자 수
	int age;//환자 나이
	public Corona() {cnt++;} 
}



