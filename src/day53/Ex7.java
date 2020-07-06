package day53;

public class Ex7 {

	public static void main(String[] args) {
		// 1부터 10까지의 짝수의 합을 반복문과 continue를 이용하여 작성하세요.
		int sum = 0;
		for(int i=1; i<=10; i++) {
			if(i%2==1)
				continue;
			sum += i;
		}
		System.out.println("1부터 10까지 합 : " + sum);
		int j=0;
		sum = 0;
		while(++j<=10) {
			if(j%2==1)
				continue;
			sum += j;
		}
		System.out.println("1부터 10까지 합 : " + sum);

	}

}
