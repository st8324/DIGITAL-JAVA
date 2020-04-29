package day9;

public class OverloadEx2 {

	public static void main(String[] args) {
		//아래 코드는 sum 메서드에 static이 안붙는 경우 호출하는 방법
		/*
		OverloadEx2 obj = new OverloadEx2();
		System.out.println(obj.sum(1,2));
		*/
		System.out.println(sum(1,2));
		System.out.println(sum(1.1, 2.1));
		System.out.println(sum(1,2,3));
		System.out.println(sum(1,2,3,4,5));
		System.out.println(sum());
		//문자 1에대한 유니코드값(아스키코드값)인 49가 대신 들어가서 자동자료형변환이 되어 연산한다.
		System.out.println(sum('1',2,3,4,5));
		//문자열 1을 실수로 형변환 할 수 없어서 에러 발생
		//에러가 발생하지 않게 하려면 문자열 1을 정수/실수/문자로 수정하던지
		//sum메서드를 오버로딩하여 문자열도 가능하도록 추가해야한다.
		//System.out.println(sum("1",2,3,4,5));
	}
	public static int sum(int num1, int num2) {
		return num1 + num2;
	}
	public static double sum(double num1, double num2) {
		return num1 + num2;
	}
	public static double sum(double num1, double num2, double num3) {
		return num1 + num2 + num3;
	}
	//가변인자를 이용한 합계구하는 메서드
	public static double sum(double...nums) {
		double res = 0.0;
		for(double tmp : nums) {
			res += tmp;
		}
		return res;
	}
	/*
	public int sum(int num1, int num2) {
		return num1 + num2;
	}
	*/
}
