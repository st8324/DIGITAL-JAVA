package day3;

public class WhileEx2 {

	public static void main(String[] args) {
		/* 두 정수 num1과 num2의 최소 공배수를 구하는 코드를 작성하세요.
		 * 최소공배수 : 두 수의 공배수중 가장 작은 공배수
		 * 공배수 : 두 수의 배수중 공통인 배수
		 * 10의 배수 : 10 20 30 40 ...
		 * 15의 배수 : 15 30 45 60 ...
		 * 10과 15의 공배수 : 30 60 90 ...
		 * 10과 15의 최소 공배수 : 30
		 * 1.반복회수 : i는 1부터 num1*num2까지 1씩 증가
		 * 2.규칙성 : i가 num1의 배수이고 i가 num2의 배수이(면) i를 출력하고 반복문을 종료
		 * 3.반복문 종료 후 : 없음
		 */
		int num1 = 5, num2 = 10000;
		int i;
		int cnt = 0;
		i=1;
		while(i <= num1*num2) {
			cnt++;
			if(i % num1 == 0 && i % num2 == 0) {
				System.out.printf("%d와 %d의 최소공배수 : %d, 반복횟수 : %d\n"
						,num1,num2,i,cnt);
				break;
			}
			i++;
		}
		/* 위 예제는 i가 1부터 시작해서 최소 공배수를 구하기 때문에 최소 공배수가 큰 경우
		 * 반복횟수가 많아진다.
		 * 그래서 아래처럼 i를 num1부터 시작하여 num1의 배수로 한다면 반복횟수가 줄어든다. 
		 * */
		i=num1;
		cnt = 0;
		while(i <= num1*num2) {
			cnt++;
			if(i % num2 == 0) {
				System.out.printf("%d와 %d의 최소공배수 : %d, 반복횟수 : %d\n"
						,num1,num2,i,cnt);
				break;
			}
			i+=num1;
		}
		if(num1 < num2) {
			//두 수를 교환하는 코드 p.23~24
			int tmp = num1;
			num1 = num2;
			num2 = tmp;
		}
		i=num1;
		cnt = 0;
		while(i <= num1*num2) {
			cnt++;
			if(i % num2 == 0) {
				System.out.printf("%d와 %d의 최소공배수 : %d, 반복횟수 : %d\n"
						,num1,num2,i,cnt);
				break;
			}
			i+=num1;
		}
	}

}
