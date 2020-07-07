package day54;

public class Ex3 {
	
	public static void main(String[] args) {
		// - 두 실수와 산술 연산자가 주어지면 산술연산 결과를 출력하는 코드를 메서드를 생성하여 작성하세요. 예외처리까지 하세요.
		try {
			calc(1,0,'?');
		}catch(Exception e) {
			e.printStackTrace();
		}

	}
	
	public static double calc(double num1, double num2, char op ) throws Exception{
		switch(op) {
		case '+':	return num1 + num2;
		case '-':	return num1 - num2;
		case '*':	return num1 * num2;
		case '/':	
			if(num2 == 0)
				throw new ArithmeticException("0으로 나눌 수 없습니다.");
			return num1 / num2;
		case '%':
			if(num2 == 0)
				throw new ArithmeticException("0으로 나눌 수 없습니다.");
			return num1 % num2;
		default:
			throw new Exception(op+"는 산술 연산자가 아님니다.");
		}
	}
}
