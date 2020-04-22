package day4;

import java.util.Scanner;

public class TestEx1 {

	public static void main(String[] args) {
		/* 두 정수와 문자하나를 입력받아 출력하는 코드를 작성하세요.
		 * 두 정수와 문자 하나를 입력받아 
		 *  => 정수형 변수 2개를 선언하고, 문자형 변수 1개를 선언후 Scanner를 통해 
		 * 		정수와 문자를 입력받을 수 있다
		 * 출력하는 => System.out.println을 활용할 수 있다.
		 * */
		int num1, num2;
		char op;
		Scanner scan = new Scanner(System.in);

		System.out.print("두 정수와 문자를 입력하세요.(예:1 + 2):");
		num1 = scan.nextInt();
		op = scan.next().charAt(0);
		num2 = scan.nextInt();
		
		scan.close();
		/* 입력받은 문자 op가 +와 같다면 두 수의 합을 출력하고
		 * op가 -와 같다면 두 수의 차를 출력하고
		 * op가 /와 같다면 두 수의 나눈 결과를 출력하고
		 * op가 *와 같다면 두 수의 곱한 결과를 출력하고
		 * op가 %와 같다면 두 수의 나머지 결과를 출력하는 코드를 작성하세요.
		 */
		if(op == '+') {
			System.out.printf("%d %c %d = %d\n", num1, op, num2, num1+num2);
		}
		else if(op == '-') {
			System.out.printf("%d %c %d = %d\n", num1, op, num2, num1-num2);
		}
		else if(op == '/') {
			System.out.printf("%d %c %d = %.2f\n", num1, op, num2, (double)num1/num2);
		}
		else if(op == '*') {
			System.out.printf("%d %c %d = %d\n", num1, op, num2, num1*num2);
		}
		else if(op == '%') {
			System.out.printf("%d %c %d = %d\n", num1, op, num2, num1%num2);
		}
		else {
			System.out.println(op + "는 산술연산자가 아닙니다.");
		}
		switch(op) {
		case '+':	
			System.out.printf("%d %c %d = %d\n", num1, op, num2, num1+num2);
			break;
		case '-':	
			System.out.printf("%d %c %d = %d\n", num1, op, num2, num1-num2);
			break;
		case '*':	
			System.out.printf("%d %c %d = %d\n", num1, op, num2, num1*num2);
			break;
		case '%':	
			System.out.printf("%d %c %d = %d\n", num1, op, num2, num1%num2);
			break;
		case '/':	
			System.out.printf("%d %c %d = %.2f\n", num1, op, num2, (double)num1/num2);
			break;
		default:
			System.out.println(op + "는 산술연산자가 아닙니다.");
		}
	}
}
