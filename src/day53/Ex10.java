package day53;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	public static double sum(double num1, double num2) {
		return num1 + num2;
	}
	public static double sum(double num1, double num2, double num3) {
		return sum(num1, num2) + num3;
	}
	//에러 발생, 오버로딩 가능여부에서 리턴타입은 중요하지 않다
	/*public static int sum(double num1, double num2) {
		return 0;
	}*/

}
