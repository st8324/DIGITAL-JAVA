package day53;

public class Ex5 {

	public static void main(String[] args) {
		// while문 이용하여 구구단 9단을 출력하는 코드를 작성하세요.
		int num = 9;
		int i = 1;
		while(i<=9) {
			System.out.printf("%d X %d = %d\n", num, i, num*i);
			i++;
		}

	}

}
