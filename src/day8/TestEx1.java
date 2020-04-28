package day8;

public class TestEx1 {

	public static void main(String[] args) {
		//5 7 8 15 16 8 9 14줄 순으로 동작(11~13줄이 주석인 경우)
		int num1 = 1, num2 = 2;
		int res = sum(num1,num2);
		System.out.println(res);
		//5 11 12 18 19 15 16 19 12 13 14줄 순으로 동작(7~9줄이 주석인 경우)
		/*int num1 = 1, num2 = 2;
		int res = sum2(num1,num2,3);
		System.out.println(res);*/
	}
	public static int sum(int num1, int num2) {
		return num1 + num2;
	}
	public static int sum2(int num1, int num2, int num3) {
		return sum(num1,num2) + num3;
	}
}
