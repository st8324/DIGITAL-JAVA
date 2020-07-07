package day54;

public class Ex2 {

	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 0;
		try {
			throwException();
			System.out.println(num1 / num2);
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 종료");
	}
	public static void throwException() throws Exception {
		throw new Exception("예외");
	}
}

