package day6;

import java.util.Scanner;

public class TestEx3 {

	public static void main(String[] args) {
		/* 여러명 학생의 성적을 입력받아 해당 학생의 성적을 학점으로 출력하세요.
		 * 학생의 성적이 음수가 입력되면 종료하도록 하세요.
		 * 100~90 : A
		 * 89~80  : B
		 * 79~70  : C
		 * 69~60  : D
		 * 59~0   : F
		 * 100점이상: 잘못된 수입니다. 
		 * 예시
		 * 성적을 입력하세요.: 100
		 * 100는 A학점
		 * 성적을 입력하세요.: 70
		 * 70는 C학점
		 * 성적을 입력하세요.: 40
		 * 0는 F학점
		 * 성적을 입력하세요.: 120
		 * 100는 잘못된 점수입니다.
		 * 성적을 입력하세요.: 80
		 * 80는 B학점
		 * */
		Scanner scan = new Scanner(System.in);
		for(int i=1; ; i++) {
			System.out.print("성적을 입력하세요.(종료하면 음수를 입력하세요):");
			int score = scan.nextInt();
			//90<= score && score<=100
			if(90<=score && score <=100) {
				System.out.println(score+"는 A학점");
			}else if(80<=score && score <=89) {
				System.out.println(score+"는 B학점");
			}else if(70<=score && score <=79) {
				System.out.println(score+"는 C학점");
			}else if(60<=score && score <=69) {
				System.out.println(score+"는 D학점");
			}else if(0<=score && score <=59) {
				System.out.println(score+"는 F학점");
			}else if(score > 100) {
				System.out.println(score+"는 잘못된 점수입니다.");
			}else {
				System.out.println("지금까지 입력확인한 학생의 수는 " + (i-1) + "명입니다");
				System.out.println("종료합니다.");
				break;
			}
		}
		
	}

}
