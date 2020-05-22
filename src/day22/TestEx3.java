package day22;

import java.util.Scanner;

public class TestEx3 {
	// - 배열에서 가장 큰 값을 반환하는 메소드를 생성하고, main 메소드에서   테스트해보세요.
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[5];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt(); 
		}

		System.out.println(maxArray(arr));
		scan.close();
	}
	/* 기능 : 정수 배열에서 가장 큰 값을 반환하는 메소드
	 * 매개변수 : 배열 => int [] arr 
	 * 리턴타입 : 가장 큰 값 => int
	 * 메소드명 : maxArray
	 */
	public static int maxArray(int []arr) {
		int max = arr[0];
		for(int i = 1 ; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i]; 
			}
		}
		return max;
	}
}
