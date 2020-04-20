package day2;

public class ForEx1 {

	public static void main(String[] args) {
		// for문 기분 예제 : Hello world 5번 출력
		int i;
		for(i=1; i<=5; i++) {
			System.out.println("Hello world");
		}
		System.out.println("--------------");
		for(i=0; i<5; i++) {
			System.out.println("Hello world");
		}
		System.out.println("--------------");
		//for문 기본 예제 : 1부터 5까지 출력하는 예제
		/*
		 * 1. 반복횟수 : i는 1부터 5까지 1씩 증가
		 * 2. 규칙성 : i를 출력
		 */
		for(i=1; i<=5; i++) {
			System.out.println(i);
		}
	}
}
