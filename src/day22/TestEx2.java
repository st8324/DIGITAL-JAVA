package day22;

public class TestEx2 {
	public static void main(String[]args) {
		multiplicationTable(10, 10);
	}
	/* 기능 : 구구단을 start단부터 end단까지 출력하는 메소드
	 * 매개변수 : start단, end단 => int start, int end
	 * 리턴타입 : 없음 => void
	 * 메소드명 : multiplicationTable
	 * */
	public static void multiplicationTable(int start, int end) {
		for(int i = start; i <= end; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.printf("%d X %d = %d\n",i,j,i*j);
			}
			System.out.println();
		}
	}
}
