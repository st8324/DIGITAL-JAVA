package day19;

import java.util.Scanner;

public class TestEx2 {
	/* 정수를 입력받아 입력받은 정수를 거꾸로 만들어 원래 정수와 거꾸로한 정수의 합을 출력하는 코드를 작성하세요.
	 * 예)
	 * 정수를 입력하세요 : 12345
	 * 거꾸로한 정수 : 54321
	 * 결과 : 66666
	 * */
	public static void main(String[] args) {
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		num = scan.nextInt();
		int tmp = num;
		String res = "";
		while(tmp != 0) {
			res += tmp % 10;
			tmp = tmp / 10;
		}
		if(num!=0)
			System.out.println("거꾸로한 정수 : " + res);
		else {
			System.out.println("거꾸로한 정수 : " + num);
			res = "0";
		}
		
		int reverseNum = Integer.parseInt(res);
		System.out.println(num + reverseNum);
		
		scan.close();
	}
}
