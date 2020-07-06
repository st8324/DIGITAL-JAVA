package day53;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		// while문을 이용하여 문자를 입력받고 입력받은 문자가 y 또는 Y이면 반복문을 종료하는 코드를 작성하세요.
		Scanner scan = new Scanner(System.in);
		char ch = 'N';
		while(ch != 'y' && ch != 'Y') {
			System.out.printf("문자를 입력하세요 : ");
			ch = scan.next().charAt(0);
		}
		scan.close();
	}

}
