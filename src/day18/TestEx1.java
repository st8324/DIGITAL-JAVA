package day18;

public class TestEx1 {
	/*  - 두 정수의 최대 공약수를 구하는 메소드를 생성하고, main에서 테스트 해 보시오.
	 *  - 두 정수의 최대 공약수 메소드를 이용하여 두 정수의 최소 공배수를 구하는 메소드를 생성하고, main에서 테스트 해 보시오.
	 *   최대 공약수가 g, 두 정수가 ,A,B라고 하면 최소 공배수 l은 다음과 같다.
	 *    l = A * B / g
	 */
	public static void main(String[] args) {
		System.out.println(gcd(8,12));
		System.out.println(lcm(8,12));
	}
	/* 기능 : 두 정수의 최대 공약수를 알려주는 메소드
	 * 매개변수 : 두 정수 => int num1, int num2
	 * 리턴타입 : 최대 공약수 => int
	 * 메소드명 : gcd
	 * */
	public static int gcd(int num1, int num2) {
		if(num1 < 0 || num2 < 0)
			throw new ArithmeticException("예외 : 최대 공약수는 두 양의 정수가 필요합니다.");
		for(int i = num1; i>=1; i--) {
			if(num1 % i == 0 && num2 % i == 0) {
				return i;
			}
		}
		return 1;
	}
	public static int lcm(int num1, int num2) {
		return num1 * num2 / gcd(num1, num2);
	}
}
