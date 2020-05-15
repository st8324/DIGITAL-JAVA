package day17;

public class VariableEx1 {
	static int num1;//클래스 멤버 변수, 일반 변수
	static A a1;//클래스 변수, 참조 변수
	int num2;//객체 변수, 일반 변수
	A a2;//객체 변수, 참조 변수
	//String[] args : 매개변수, 참조 변수
	public static void main(String[] args) {
		int num3;//일반변수, 지역변수
		A a3;//참조변수, 지역변수
		a3 = new A();
		a3.num = 10;
	}
	//int num1 : 매개변수, 일반 변수
	//A a1 : 매개변수, 참조변수
	public static void test(int num1, A a1) {
		
	}
	public void test() {
		a2 = new A();
	}
}
class A{
	int num;//객체,일반
}
/* 객체 멤버 변수 : static이 없는 멤버 변수, 각 객체들이 공유하지 않는 변수,
 * 			   클래스 안의 객체 메소드안에서 선언 없이 사용 가능
 * 클래스 멤버 변수 : static이 있는 멤버 변수, 각 개체들이 공유하는 변수,
 * 			  클래스 안의 클래스 메소드안에서 선언 없이 사용 가능
 * 지역 변수 : 메소드 안에서 선언 되는 변수들(매개 변수 포함)로 해당 지역에서만 사용 가능
 * 매개 변수 : 메소드 선언부에서 ()안에 들어가는 변수들, 메소드를 실행하는데 있어 필요한 정보,
 * 			매개변수는 지역변수
 * 일반 변수 : 자료형이 int와 같은 기본 자료형인 변수로 값을 저장
 * 참조 변수 : 일반 변수가 아닌 변수로 클래스의 객체나 배열등이 있으며, 주소를 저장
 * 멤버 변수이면서 지역 변수가 될 수 있을까요? no
 * */
