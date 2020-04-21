package day3;

import java.util.Scanner;

public class ArrayEx1 {

	public static void main(String[] args) {
		/* 배열이 없으면 아래와 같이 5개의 정보를 입력받아 저장하려면 5개의 변수를 선언하고
		 * Scanner를 통해 5번 직접 입력받는 코드를 작성해야한다.
		 * 하지만 배열을 이용하면 효율적으로 입력받는 코드를 작성할 수 있다.
		 * */
		int n1, n2, n3, n4, n5;
		Scanner scan = new Scanner(System.in);
		/*n1 = scan.nextInt();
		n2 = scan.nextInt();
		n3 = scan.nextInt();
		n4 = scan.nextInt();
		n5 = scan.nextInt();
		*/
		int [] arr1, arr2;	//arr1과 arr2는 둘다 배열
		int arr3[], arr4;	//arr3는 배열, arr4는 일반 변수
		arr1 = new int [5];
		int []arr5 = new int[5];//배열 선언과 동시에 생성
		
		for(int i=0; i<arr1.length;i++) {
			arr1[i] = scan.nextInt();
		}
		for(int i=0; i<arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		scan.close();
	}
}
