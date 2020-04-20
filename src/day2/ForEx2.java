package day2;

public class ForEx2 {

	public static void main(String[] args) {
		/* 구구단 7단을 출력하는 코드를 for문을 이용하여 작성하세요.
		 * 1. 반복횟수 : i는 1부터 9까지 1씩증가
		 * 2. 규칙성 : 7 x i = 7*i를 출력
		 * 7 x 1 = 7
		 * 7 x 2 = 14
		 * 7 x 3 = 21
		 * 7 x 4 = 28
		 * 7 x 5 = 35
		 * 7 x 6 = 42
		 * 7 x 7 = 49
		 * 7 x 8 = 56
		 * 7 x 9 = 63
		 * 7 x i = 7*i
		 */
		int i, num = 6;
		for(i=1; i <=9 ; i+=1 ) {
			System.out.printf("%d x %d = %d\n",num ,i ,num*i);
		}
		for(i=1; i <=9 ; i+=1 ) {
			System.out.println(num + " x " + i + " = " + num*i);
		}
	}

}
