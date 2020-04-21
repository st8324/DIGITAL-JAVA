package day3;

import java.util.Scanner;

public class ForEx6 {

	public static void main(String[] args) {
		/* 정수 num가 소수인지 아닌지 판별하는 코드를 for문을 이용하여 작성하세요.
		 * 소수 : 약수가 2개인 수
		 * 1.반복횟수 : i는 1부터 num까지 1씩 증가
		 * 2.규칙성 : i가 num의 약수이면 약수의 갯수(cnt)를 1증가
		 * 			num를 i로 (나누었을 때 나머지)가 0과 (같다)(면) cnt를 1증가
		 *          num % i == 0 
		 * 3.반복문종료후: 약수의갯수(cnt)가 2이면 소수라고 출력하고
		 *              아니면 소수가 아님이라고 출력
		 * */
		int num = 0, cnt = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		num = scan.nextInt();
		scan.close();
		for(int i=1; i<=num; i++) {
			if(num % i == 0) {
				cnt+=1;
			}
		}
		if(cnt == 2 ) {
			System.out.println(num + "는 소수");
		}else{
			System.out.println(num + "는 소수가 아님");
		}
	}

}
