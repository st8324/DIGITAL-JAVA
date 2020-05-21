package day21;

import java.util.Scanner;

public class TestEx2 {
	// - 세 정수를 입력받아 입력받은 정수의 합과 평균을 구하세요. 평균은 소수점 2째자리까지 출력
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum = 0 ;
		double res = 0.0;
		for(int i = 1; i <= 3; i++) {
			sum += scan.nextInt();
		}
		res = (double)sum / 3.0;
		System.out.println("합 : " + sum);
		System.out.printf("평균 : %.2f", res);
		scan.close();
	}
}
