package day2;

public class OperatorEx2 {

	public static void main(String[] args) {
		//산술 연산자 예제
		System.out.println(1/2);//정수/정수=정수
		System.out.println(1.0/2);//실수/정수=실수
		//자료형변환을 이용하여 정수/정수를 실수/정수로 변환
		int num1 = 1, num2 = 2;
		System.out.println((double)num1/num2);
		//System.out.println(3/0);//에러 발생
		System.out.println(3/0.0);//무한대로 표시
		char ch1 = 'A';
		char ch2 = 'A'+ 1;
		System.out.println(ch2);
		char ch3 = (char)(ch1 + 1);
		System.out.println(ch3);
	}

}
