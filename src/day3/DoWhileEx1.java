package day3;

import java.util.Scanner;

public class DoWhileEx1 {

	public static void main(String[] args) {
		int menu = 4;
		Scanner scan = new Scanner(System.in);
		 do{
			System.out.println("1.메뉴1");
			System.out.println("2.메뉴2");
			System.out.println("3.메뉴3");
			System.out.println("4.종료");
			System.out.print("메뉴를 입력하세요 : ");
			menu = scan.nextInt();
		}while(menu != 4);
		scan.close();

	}

}
