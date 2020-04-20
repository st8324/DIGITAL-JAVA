package day2;

public class ForEx4 {

	public static void main(String[] args) {
		/* num가 주어지면 주어진 num의 약수를 출력하는 코드를 for문으로 작성하세요.
		 * 약수 : 나누었을 때 나머지가 0인 수
		 * 4의 약수 : 1 2 4
		 * 1.반복횟수 : i는 1부터 num까지 1씩 증가
		 * 2.규칙성 : i가 num의 약수이면 i를 출력
		 *   num를 i로 (나누었을 때 나머지)가 0과 (같다)(면) i를 출력
		 * 3.반복문 종료 후 : 없음
		 * */
		int i, num = 4;
		for(i=1; i<=num; i++) {
			if(num % i == 0 ) {
				System.out.printf(""+i+(i!=num?",":""));
			}
		}
	}
}
