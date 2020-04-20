package day2;

public class RandomEx1 {

	public static void main(String[] args) {
		// 랜덤한 수 생성 예제
		int min = 0;
		int max = 10;
		int random = 0;
		random = (int)(Math.random()*(max-min+1))+min;
		System.out.println(random);
		random = (int)(Math.random()*(max-min+1))+min;
		System.out.println(random);
		random = (int)(Math.random()*(max-min+1))+min;
		System.out.println(random);
		random = (int)(Math.random()*(max-min+1))+min;
		System.out.println(random);
		
	}

}
