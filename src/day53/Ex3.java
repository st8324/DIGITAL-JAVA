package day53;

public class Ex3 {
	public static void main(String[]args) {
		//for문을 이용하여 구구단 9단을 출력하는 코드를 작성하세요.
		int num = 9;
		for(int i = 1; i<=9; i++) {
			System.out.printf("%d X %d = %d\n",num, i, num*i);
		}
	}
}
