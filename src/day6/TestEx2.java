package day6;

import java.util.Scanner;

public class TestEx2 {

	public static void main(String[] args) {
		/* 문자를 입력받아 출력하는 과정을 q가 입력될때까지 반복하세요.
		 * 예시
		 * 입력하세요 : a
		 * 출력 : a
		 * 입력하세요 : q
		 * 종료합니다.
		 */
		Scanner scan = new Scanner(System.in);
		char ch;
		
		for(int i = 1; i <= 5;  ) {
			System.out.print("문자를 입력하세요 : ");
			ch = scan.next().charAt(0);
			if(ch != 'q')
				System.out.println("입력 받은 문자 : " + ch);
			else {
				System.out.println("종료합니다.");
				break;
			}
		}
		scan.close();
	}

}
