package day13;

public class ExceptionEx2 {

	public static void main(String[] args) {
		//throw를 통해 예외를 발생 시키는 예제
		int num1 = 1, num2 = 0;
		char op = '?';
		try {
			switch(op) {
			case '+':	System.out.println(num1+num2); 	break;
			case '-':	System.out.println(num1-num2); 	break;
			case '*':	System.out.println(num1*num2); 	break;
			case '/':	System.out.println(num1/num2); 	break;
			case '%':	System.out.println(num1%num2); 	break;
			default:	throw new Exception(op+"는 산술연산자가 아닙니다.");
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
