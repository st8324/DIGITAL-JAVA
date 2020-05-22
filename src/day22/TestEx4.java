package day22;

import java.util.Scanner;

public class TestEx4 {

	/*  - 배열이 주어지면 주어진 배열의 평균을 구하는 메소드,
	 *    배열이 주어지면 주어진 배열의 합을 구하는 메소드를 생성하여
	 *      main메소드에서 테스트해보세요.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum = 0 ;
		double res = 0.0;
		int arr[] = new int[5];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt(); 
		}
		
		sum = sum(arr);
		res = average(arr);
		
		System.out.println("합 : " + sum);
		System.out.printf("평균 : %.2f", res);
		scan.close();
	}
	/* 기능 : 주어진 배열의 모든 원소의 합을 반환하는 메소드
	 * 매개변수 : 배열 => int []arr
	 * 리턴타입 : 합 => int
	 * 메소드명 : sum
	 */
	public static int sum(int []arr) {
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	/* 기능 : 주어진 배열의 모든 원소의 평균을 반환하는 메소드
	 * 매개변수 : 배열 => int []arr
	 * 리턴타입 : 평균(소수점 가능) => double
	 * 메소드명 : average
	 */
	public static double average(int []arr) {
		return (double)sum(arr) / arr.length;
	}
}
