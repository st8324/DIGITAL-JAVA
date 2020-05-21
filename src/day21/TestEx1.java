package day21;

import java.util.Scanner;

public class TestEx1 {
	// - 두 정수를 입력받아 입력받은 정수 중 큰 수를 출력하는 코드를 작성하세요. 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		if(num1 > num2)
			System.out.println(num1);
		else
			System.out.println(num2);
		scan.close();
	}

}
