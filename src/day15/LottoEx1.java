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
		int min = 1, max = 10;
		int auto[] = null;
		try {
			auto = createRandomArray(min, max, 6);
			createRandomArray(min, max, lotto);
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		for(int tmp : lotto) {
			System.out.print(tmp + " ");
		}
		System.out.println();
		for(int tmp : auto) {
			System.out.print(tmp + " ");
		}
		System.out.println();
	}
	/* 기능 : min과 max가 주어지면 min보다 크거나 같고 max보다 작거나 같은 랜덤한 수를 반환하는 메소드
	 * 매개변수 : 최소값과 최댓값 => int min, int max
	 * 리턴타입 : 랜덤한 수 => 정수 => int
	 * 메소드명 : random
	 */
	public static int random(int min, int max) {
		if(max < min)
			throw new ArithmeticException("최소값과 최대값 순서가 바뀌었습니다.");
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
		if(arr == null)	throw new NullPointerException("빈 배열입니다.");
		if(arr.length > max-min+1)
			throw new Exception("랜덤한 수의 범위보다 배열의 크기가 큽니다.");
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
			throw new Exception("랜덤한 수의 범위보다 배열의 크기가 큽니다.");
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
}




