package day15;

import java.util.Random;

public class LottoEx1 {

	public static void main(String[] args) {
		/* 1. 중복되지 않은 랜덤한 수 6개를 배열에 저장하고, 중복되지 않은 랜덤한 수 1개를 변수에 저장
		 *    (1~45) : 당첨번호
		 * 2. 중복되지 않은 랜던한 수 6개를 배열에 저장(1~45) : 자동 생성번호
		 * 3. 맞은 갯수를 체크 + 보너스 번호가 맞는지 체크
		 * 4. 맞은 갯수와 보너스 번호 맞는지 여부에 따라 등수를 출력
		 * */
		int lotto[] = new int[6];
		int min = 1, max = 8;
		int auto[] = null;
		int bonus = 0;
		try {
			auto = createRandomArray(min, max, 6);
			createRandomArray(min, max, lotto);
			
			bonus = min-1;
			while( !(bonus >= min && bonus <= max) ) {
				bonus = random(min,max);
				if(contains(lotto, bonus)) {
					bonus = min-1;
				}
			}
			printArray(lotto);
			System.out.println("보너스 : " + bonus);
			printArray(auto);
			System.out.println();
			int rank = rank(lotto, bonus, auto); 
			if(rank != -1) {
				System.out.println(rank+"등 당첨!");
			}else {
				System.out.println("꽝!");
			}
			
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	/* 기능 : min과 max가 주어지면 min보다 크거나 같고 max보다 작거나 같은 랜덤한 수를 반환하는 메소드
	 * 매개변수 : 최소값과 최댓값 => int min, int max
	 * 리턴타입 : 랜덤한 수 => 정수 => int
	 * 메소드명 : random
	 */
	public static int random(int min, int max) {
		if(max < min)
			throw new ArithmeticException("예외 : 최소값과 최대값 순서가 바뀌었습니다.");
		return new Random().nextInt(max-min) + min;
	}
	/* 기능 : 배열에 정수 num의 값이 있는지 없는지 알려주는 메소드
	 * 매개변수 : 배열, 정수 num => int[]arr, int num
	 * 리턴타입 : 있는지 없는지 => boolean
	 * 메소드명 : contains
	 * */
	public static boolean contains(int []arr, int num) {
		for(int tmp : arr) {
			if(tmp == num)
				return true;
		}
		return false;
	}
	/* 기능1 : 최소값과 최대값 사이에서 랜덤한 수를 중복되지 않게 만들어서 배열의 갯수만큼 저장하는 메소드
	 * 기능2 : 최소값과 최대값 사이에서 랜덤한 수를 중복되지 않게 cnt개 만들어서 배열에 저장하여 배열을 
	 *        반환하는 메소드
	 * 매개변수1 : 최소값, 최대값, 배열 => int min, int max, int []arr
	 * 매개변수2 : 최소값, 최대값, 갯수 => int min, int max, int cnt
	 * 리턴타입1 : 없음
	 * 리턴타입2 : 배열 => int []
	 * 메소드명 : createRandomArray
	 * */
	public static void createRandomArray(int min, int max, int []arr) 
		throws Exception, NullPointerException{
		if(arr == null)	throw new NullPointerException("예외 : 빈 배열입니다.");
		if(arr.length > max-min+1)
			throw new Exception("예외 : 랜덤한 수의 범위보다 배열의 크기가 큽니다.");
		int nowCnt = 0;
		while(nowCnt < arr.length) {
			int r = random(min,max);
			if(!contains(arr, r)) {
				arr[nowCnt] = r;
				nowCnt++;
			}
		}
	}
	public static int[] createRandomArray(int min, int max, int cnt) 
		throws Exception {
		if(cnt > max-min+1)
			throw new Exception("예외 : 랜덤한 수의 범위보다 배열의 크기가 큽니다.");
		int []arr = new int[cnt];
		int nowCnt = 0;
		while(nowCnt < arr.length) {
			int r = random(min,max);
			if(!contains(arr, r)) {
				arr[nowCnt] = r;
				nowCnt++;
			}
		}
		return arr;
	}
	public static void printArray(int []array) {
		for(int tmp : array) {
			System.out.printf("%2d ",tmp);
		}
	}
	/* 기능 : 당첨번호를 기준으로 자동생성된 번호가 몇등인지 알려주는 메소드(꽝 : -1)
	 * 매개변수 : 당첨번호, 자동생성 번호=> int []lotto, int bonus, int []auto
	 * 리턴타입 : 등수=>정수
	 * 메소드명 : rank
	 * */
	public static int rank(int []lotto, int bonus, int[] auto) {
		int sameCnt = 0;
		for(int tmp:lotto) {
			if(contains(auto, tmp)) {
				sameCnt++;
			}
		}
		switch(sameCnt) {
		case 6:	return 1;
		case 5:	
			if(contains(auto, bonus))	return 2;
			return 3;
		case 4:	return 4;
		case 3:	return 5;
		}
		return -1;
	}
}




