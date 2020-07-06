package day53;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		// or문을 이용하여 문자를 입력받고 입력받은 문자가 y또는 Y이면 반복문을 종료하는 코드를 작성하세요.
		Scanner scan = new Scanner(System.in);
		char ch = 'N';
		//입력받은 값 ch가 y가 아니고 Y가 아니면 반복
		/*for( ; ch != 'y' && ch != 'Y'; ) {
			System.out.print("문자를 입력하세요 : ");
			ch = scan.next().charAt(0);
		}*/
		for( ; ; ) {
			System.out.print("문자를 입력하세요 : ");
			ch = scan.next().charAt(0);
			if(ch == 'y' || ch == 'Y')
				break;
		}
		System.out.println("프로그램이 종료되었습니다.");
		scan.close();
	}

}
