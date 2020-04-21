package day3;

import java.util.Scanner;

public class ForEx7 {

	public static void main(String[] args) {
		/* 두 정수 num1과 num2의 최대 공약수를 구하는 코드를 작성하세요.
		 * 최대 공약수 : 공약수 중에서 가장 큰 수
		 * 공약수 : 두수의 약수중 공통으로 있는 수
		 * 약수 : 나누어 떨어지는 수
		 * 8의 약수 : 1 2 4 8
		 * 12의 약수: 1 2 3 4 6 12
		 * 8과 12의 공약수 : 1 2 4
		 * 8과 12의 최대 공약수 : 4
		 * 1.반복횟수 : i는 1부터 num1까지 1씩 증가
		 * 2.규칙성 : i는 num1과 num2의 공약수이면 gcd에 i를 저장
		 * 			i가 num1의 약수이고 i가 num2의 약수이면 gcd에 i를 저장
		 * 3.반복문 종료 후 : gcd를 출력
		 * */
		int num1,num2;
		int gcd = 1;
		System.out.print("두 정수를 입력하세요 : ");
		Scanner scan = new Scanner(System.in);
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		scan.close();
		for(int i=1; i<=num1; i++) {
			if(num1 % i == 0 && num2 % i == 0) {
				gcd = i;
			}
		}
		System.out.printf("%d와 %d의 최대 공약수 : %d\n", num1, num2, gcd);	
	}

}
