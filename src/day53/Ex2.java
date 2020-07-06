package day53;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		/* 성적을 정수로 입력받아 입력받은 성적에 맞는 학점을 출력하는 코드를 작성하세요.
		 * A+ : 100~95
		 * A  : 94~90
		 * B+ : 89~85
		 * B  : 84~80
		 * C+ : 79~75
		 * C  : 74~70
		 * D+ : 69~65
		 * D  : 64~60
		 * F  : 0~59		 */
		Scanner scan = new Scanner(System.in);
		System.out.print("성적을 입력하세요 : ");
		int score = scan.nextInt();
		if(score <= 100 && score >= 90) {
			if(score >= 94)
				System.out.println("A+");
			else
				System.out.println("A");
		}
		else if(score <= 89 && score >= 80) {
			if(score >= 84)
				System.out.println("B+");
			else
				System.out.println("B");
		}
		else if(score <= 79 && score >= 70) {
			if(score >= 74)
				System.out.println("C+");
			else
				System.out.println("C");
		}
		else if(score <= 69 && score >= 60) {
			if(score >= 64)
				System.out.println("D+");
			else
				System.out.println("D");
		}
		else if(score <= 59 && score >= 0) {
			System.out.println("F");
		}
		else {
			System.out.println("잘못된 성적입니다.");
		}
		scan.close();
	}

}
