package day5;

public class MethodEx1 {

	public static void main(String[] args) {
		System.out.println(gcd(10,15));
		gcd2(10,15);
		System.out.println(lcm(10,15));
		if(isPrime(343)) {
			System.out.println("343은 소수");
		}else {
			System.out.println("343은 소수가 아님");
		}
	}
	/* 기능 : 두 정수의 합을 알려주는 메서드
	 * 매개변수 : 두 정수=> int num1, int num2
	 * 리턴타입 : 합 => 정수 => int
	 * 메서드명 : sum
	 * */
	public static int sum(int num1, int num2) {
		/* return : 메서드를 종료하고, 값을 전달하는 역할 */
		return num1 + num2;
	}
	/* 기능 : 두 정수의 최대 공약수를 알려주는 메서드
	 * 매개변수 : 두 정수=>int num1, int num2
	 * 리턴타입 : 최대 공약수=>정수=>int
	 * 메서드명 : gcd
	 * */
	public static int gcd(int num1, int num2){
		int res=1;//최대 공약수를 저장하는 변수
		for(int i=1; i<num1; i++) {
			if(num1%i==0 && num2%i==0) {
				res = i;
			}
		}
		return res;
	}
	public static void gcd2(int num1, int num2){
		int res=1;//최대 공약수를 저장하는 변수
		for(int i=1; i<num1; i++) {
			if(num1%i==0 && num2%i==0) {
				res = i;
			}
		}
		System.out.println(res);
	}
	public static int lcm(int num1, int num2) {
		return num1 * num2 / gcd(num1,num2);
	}
	/* 기능 : 정수가 소수인지 아닌지 판별하는 메소드
	 * 매개변수 : 정수=> int num 
	 * 리턴타입 : 소수인지아닌지=>참,거짓=>boolean
	 * 메소드명 : isPrime
	 * */
	public static boolean isPrime(int num) {
		int cnt = 0;
		for(int i=1; i*i <= num; i++) {
			if(num % i == 0) {
				cnt++;
			}
		}
		if(cnt == 1) {
			return true;
		}else {
			return false;	
		}
	}
}




