package day13;

public class ExceptionEx3 {

	public static void main(String[] args) {
		//System.out.println(calc(1,'%',0));//예외가 발생하여 프로그램이 강제 종료
		try {
			System.out.println(calc(1,'%',0));//예외가 발생하지만 프로그램은 정상 실행
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	/* calc 메소드는 예외처리를 하지 않고 예외를 발생만 시킨다.
	 * 예외처리는 main 메소드에서 할 것이다.
	 * 발생한 예외가 RuntimeException이면 메소드 옆에 발생 가능한 예외를 생략해도 되지만
	 * RuntimeExcepion이 아닌 경우는 메소드 옆에 발생 가능한 예외를 써 주어야 한다.
	 * */
	public static double calc(int num1, char op, int num2) 
			throws Exception, ArithmeticException{
		double res = 0.0;
		switch(op) {
		case '+':	res = num1 + num2; 	break;
		case '-':	res = num1 - num2; 	break;
		case '*':	res = num1 * num2; 	break;
		case '/':
			if(num2 == 0)throw new ArithmeticException("0으로 나눌 수 없습니다.");
			res = (double)num1 / num2; 	break;
		case '%':
			if(num2 == 0)throw new ArithmeticException("0으로 나눌 수 없습니다.");
			res = num1 % num2; 	break;
		default:	throw new Exception(op+"는 산술연산자가 아닙니다.");	
		}
		return res;
	}
}
