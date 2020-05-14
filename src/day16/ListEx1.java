package day16;
import java.util.*;
public class ListEx1 {

	public static void main(String[] args) {
		/* 1~10사이의 랜덤한 수를 6개를 생성하여 리스트에 저장하고, 출력하는 코드를 작성하세요.
		 * 단, 중복 불가*/
		//1. 리스트 생성
		List<Integer> list = new ArrayList<Integer>();
		//2. 반복문 실행 => 종료조건 설정
		while(list.size() < 6) {
			//2-1. 1~10사이의 랜덤한 수를 생성
			int r = new Random().nextInt(10)+1;
			//2-2. 리스트에 생성된 랜덤수가 있는지 체크
			//2-2-1. 없으면 리스트에 추가
			if(!list.contains(r)) {
				list.add(r);
			}
		}
		//3. 리스트 출력
		System.out.println(list);
	}
}
