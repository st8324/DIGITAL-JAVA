package day21;

import java.util.Scanner;

public class TestEx3 {
	//  - 5개짜리 배열을 만들어서 배열에 5개의 정수를 입력 한 후, 입력한 정수의 합과 평균를 구하세요.(반복문과 배열을 꼭 이용)
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum = 0 ;
		double res = 0.0;
		int arr[] = new int[5];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt(); 
			sum += arr[i];
		}
		res = (double)sum / arr.length;
		System.out.println("합 : " + sum);
		System.out.printf("평균 : %.2f", res);
		scan.close();
	}
}
