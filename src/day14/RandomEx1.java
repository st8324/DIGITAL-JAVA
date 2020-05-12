package day14;

import java.util.Random;

public class RandomEx1 {

	public static void main(String[] args) {
		double r1 = Math.random();//0보다크거나 같고 1보다 작은 랜덤한 수
		System.out.println(r1);
		//현재시간을 기준으로 Random 객체를 생성
		Random random = new Random();
		double r2 = random.nextDouble();//0보다크거나 같고 1보다 작은 랜덤한 수
		System.out.println(r2);
		//new를 통해 객체를 생성하고, Random()생성자를 호출하여 초기화 한 후에 
		//nextDouble()메소드를 호출
		double r3 = new Random().nextDouble();
		System.out.println(r3);
		double r4 = random.nextDouble();
		System.out.println(r4);
		String str = "123 afd \t1 \n";
		//trim()는 결과가 String(문자열)이기 때문에 trim()을 하고 나서 이어서
		//바로 String의 멤버 메소드인 charAt()을 호출할 수 있다.
		System.out.println(str.trim().charAt(2));
		System.out.println("-----------");
		int max = 10, min = 1;
		int ran1 = (int)(Math.random()*(max-min+1)+min);
		System.out.println(ran1);
		//nextInt(a) : 0~a사이의 랜덤한 수를 만듬
		int ran2 = random.nextInt(max-min) + min;
		System.out.println(ran2);
	}
}
