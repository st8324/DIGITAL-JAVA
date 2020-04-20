package day2;

public class OperatorEx5 {

	public static void main(String[] args) {
		//조건 연산자 예제
		int num = 4;
		boolean isEven = (num % 2 == 0) ? true : false;
		boolean isOdd = (num % 2 == 0) ? false : true;
		System.out.println(num + "는 짝수입니까? : " + isEven);
		System.out.println(num + "는 홀수입니까? : " + isOdd);
	}

}
