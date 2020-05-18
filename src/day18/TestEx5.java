package day18;

import java.util.Scanner;

public class TestEx5 {
	
	/*  - 두 정수가 주어졌을 때 두 정수의 최대 공약수가 1이면 서로소라고 출력하고, 
	 * 서로소가 아니면 서로소가 아님이라고 출력하는 코드를 작성하세요. 
	 * 단 메소드를 생성하여 작업할 것.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		if(isCoprime(num1, num2)) {
			System.out.printf("%d와 %d는 서로소 관계\n",num1,num2);
		}else {
			System.out.printf("%d와 %d는 서로소 관계아님\n",num1,num2);
		}
		scan.close();
	}
	/* 기능 : 두 정수가 서로소 관계이면 true, 아니면 false의 값을 알려주는 메소드
	 * 매개변수 : 두 정수=> int num1, int num2
	 * 리턴타입 : 서로소 관계 여부(true,false) => boolean 
	 * 메소드명 : isCoprime */
	public static boolean isCoprime(int num1, int num2) {
		if(num1 == num2)	return false;
		if(TestEx1.gcd(num1, num2) == 1)
			return true;
		return false;
		//return TestEx1.gcd(num1, num2) == 1? true:false;
	}
}
