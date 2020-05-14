package day16;

import java.util.*;

public class LottoEx2 {

	public static void main(String[] args) {
		HashSet<Integer> lotto = new HashSet<Integer>(); 
		HashSet<Integer> auto;
		int min = 1, max = 45;
		int bonus = 0;
		
		try {
			auto = createRandomSet(min, max, 6);
			createRandomSet(min, max, lotto, 6);
			
			bonus = min-1;
			while(true) {
				bonus = random(min,max);
				if(!lotto.contains(bonus)) {
					break;
				}
			}
			printSet(lotto);
			System.out.println("보너스 : " + bonus);
			printSet(auto);
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
		return new Random().nextInt(max-min+1) + min;
	}
	
	public static void createRandomSet(int min, int max, HashSet<Integer> lotto, int cnt) 
		throws Exception, NullPointerException{
		if(lotto == null)	throw new NullPointerException("예외 : 빈 배열입니다.");
		if(cnt > max-min+1)
			throw new Exception("예외 : 랜덤한 수의 범위보다 배열의 크기가 큽니다.");
		
		while(lotto.size() < cnt) {
			lotto.add(random(min,max));
		}
	}
	public static HashSet<Integer> createRandomSet(int min, int max, int cnt) 
		throws Exception {
		if(cnt > max-min+1)
			throw new Exception("예외 : 랜덤한 수의 범위보다 배열의 크기가 큽니다.");
		HashSet<Integer> set = new HashSet<Integer>();
		while(set.size() < cnt) {
			set.add(random(min,max));
		}
		return set;
	}
	public static void printSet(HashSet<Integer> lotto) {
		for(Integer tmp : lotto) {
			System.out.printf("%2d ",tmp);
		}
	}
	/* 기능 : 당첨번호를 기준으로 자동생성된 번호가 몇등인지 알려주는 메소드(꽝 : -1)
	 * 매개변수 : 당첨번호, 자동생성 번호=> int []lotto, int bonus, int []auto
	 * 리턴타입 : 등수=>정수
	 * 메소드명 : rank
	 * */
	public static int rank(HashSet<Integer> lotto, int bonus, HashSet<Integer> auto) {
		int sameCnt = 0;
		for(int tmp:lotto) {
			if(auto.contains(tmp)) {
				sameCnt++;
			}
		}
		switch(sameCnt) {
		case 6:	return 1;
		case 5:	return auto.contains(bonus)? 2 : 3;
		case 4:	return 4;
		case 3:	return 5;
		}
		return -1;
	}
}




