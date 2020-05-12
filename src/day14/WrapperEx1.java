package day14;

public class WrapperEx1 {

	public static void main(String[] args) {
		boolean b1 = true;
		Boolean b2 = true;
		char ch1 = 'a';//ch1 변수에 a를 저장
		Character ch2 = 'a';//a가 저장된 주소를 ch2에 전달, 오토박싱
		ch1 = ch2;//언박싱
		int num1 = 10;
		Integer num2 = 10;
		double dnum1 = 1.23;
		Double dnum2 = 1.23;
		Double dnum3 = new Double(1.23);

	}

}
