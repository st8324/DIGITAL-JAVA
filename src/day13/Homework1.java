package day13;

import java.util.Scanner;

public class Homework1 {
	/*
	 * 1~50사이의 랜덤한 수를 컴퓨터가 생성하고, 사용자가 해당수를 맞추는 게임
	 * 예) 컴퓨터가 랜덤으로 생성된 수가 34
	 * 입력 : 50
	 * down
	 * 입력 : 20
	 * up
	 * 입력 : 35
	 * down
	 * 입력 : 30
	 * up
	 * 입력 : 34
	 * 정답
	 */
	public static void main(String[] args) {
		//1.랜덤한 수를 생성
		int max = 50, min = 1;
		int random = (int)(Math.random()*(max - min + 1) + min);
		Scanner scan = new Scanner(System.in);
		int num = min - 1;
		//2.반복문을 작업 => 랜덤수를 맞출때까지
		while(num != random) {
			//3.정수를 입력
			num = scan.nextInt();
			//4.비교를 통해 up 또는 down 출력
			if(num > random) {
				System.out.println("down");
			}else if(num < random) {
				System.out.println("up");
			}else {
				System.out.println("정답!");
			}
		}
		scan.close();
	}
}
