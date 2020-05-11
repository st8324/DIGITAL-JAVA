package day13;

import java.util.Scanner;

public class Homework2 {
	/* 상품을 등록하고, 등록된 상품을 출력하는 코드를 작성하세요.
	 * 예)
	 * 상품을 등록하겠습니까?(y/n) : y
	 * 상품명 : 가방
	 * 가격 : 10000
	 * 상품을 등록하겠습니까?(y/n) : y
	 * 상품명 : 마우스
	 * 가격 : 1000
	 * 상품을 등록하겠습니까?(y/n) : n
	 * 지금까지 등록된 상품 리스트
	 * 1. 상품명 : 가방, 가격 : 10000원
	 * 2. 상품명 : 마우스, 가격 : 1000원
	 */
	public static void main(String[] args) {
		int size = 50;
		String [] productName = new String[size];
		int [] productPrice = new int[size];
		char menu = 'y';
		Scanner scan = new Scanner(System.in);
		int cnt = 0;//현재 저장된 제품의 갯수
		//1.반복문
		while(menu != 'n') {
			//2.입력을 받음(y/n)
			System.out.print("상품을 등록하겠습니까?(y/n) : ");
			menu = scan.next().charAt(0);
			//3.입력받은 값을 통해 제품을 등록할지를 결정
			if(menu == 'y') {
				//제품을 등록
				System.out.print("상품명 : ");
				productName[cnt] = scan.next();
				System.out.print("가격 : ");
				productPrice[cnt] = scan.nextInt();
				cnt++;
			}
		}
		int total = 0;
		//등록된 제품 리스트 출력
		for(int i=0; i<cnt; i++) {
			System.out.printf("%d. 상품명 : %s, 가격 : %d원\n",i+1,productName[i]
					,productPrice[i]);
			total += productPrice[i];
		}
		System.out.println("총 가격 : " + total + "원");
		scan.close();
	}
}
