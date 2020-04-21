package day3;

import java.util.Scanner;

public class WhileEx1 {

	public static void main(String[] args) {
		// while에서 무한루프 예제
		/*
		while(true) {
			System.out.println("Hi");
		}
		*/
		int menu = 4;
		Scanner scan = new Scanner(System.in);
		while(menu != 4) {
			System.out.println("1.메뉴1");
			System.out.println("2.메뉴2");
			System.out.println("3.메뉴3");
			System.out.println("4.종료");
			System.out.print("메뉴를 입력하세요 : ");
			menu = scan.nextInt();
		}
		scan.close();
	}

}
