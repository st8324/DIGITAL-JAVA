package day18;

import java.util.*;

public class TestEx4 {
	/* - 정수가 주어졌을 때 해당 정수가 소수인지 아닌지 출력하는 코드를 작성하세요. 
	 * 단 메소드를 생성하여 작업할 것.*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		try {
			if(isPrime(num1)) {
				System.out.println(num1+"은 소수");
			}else {
				System.out.println(num1+"은 합성수");
			}
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		scan.close();
		
	}
	/* 기능 : 정수가 소수이면 true를 소수가 아니면 false를 반환하는 메소드 
	 * 매개변수 : 정수 => int num
	 * 리턴타입 : true아니면 false => boolean
	 * 메소드명 : isPrime */
	public static boolean isPrime(int num) {
		if(num == 1) {
			throw new ArithmeticException("예외 : 1은 소수도 합성수도 아닙니다.");
		}
		if(num < 1) {
			throw new ArithmeticException("예외 : 음수와 0은 소수 판별은 할 수 없습니다.");
		}
		for(int i = 2; i*i <= num; i++) {
			//i가 num의 약수이면, num가 i의 배수이면
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
}
