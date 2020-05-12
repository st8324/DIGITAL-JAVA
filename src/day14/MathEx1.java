package day14;
import static java.lang.Math.*;

public class MathEx1 {

	public static void main(String[] args) {
		//1.51를 소수점 첫째자리에서 올림
		System.out.println(Math.ceil(1.51));
		//1.51를 소수점 첫째자리에서 버림
		System.out.println(Math.floor(1.51));
		//1.51를 소수점 첫째자리에서 반올림
		System.out.println(Math.round(1.51));
		
		double num = 1.51;
		num = num * 10;
		//1.51를 소수점 둘째자리에서 올림
		System.out.println(Math.ceil(num)/10);
		//1.51를 소수점 둘째자리에서 버림
		System.out.println(Math.floor(num)/10);
		//1.51를 소수점 첫째자리에서 반올림
		System.out.println(Math.round(num)/10.0);
	}
}
