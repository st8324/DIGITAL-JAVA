package day23;

import java.util.*;

public class ListTest1 {

	public static void main(String[] args) {
		/*  - 정수 5개를 입력받아 리스트에 저장하고, 저장된 값들의 합과 평균을 구하는 코드를
		 *    작성하세요.
		 *  - 합과 평균을 메소드를 이용하여 확인하도록 코드를 작성하세요.
		 *  - Iterator를 이용하여 작성하세요.
		 */
		/* List는 지네릭스 클래스이기 때문에 <>안에 클래스 명을 넣어주어야 하고,
		 * int는 클래스가 아니기 때문에 int의 래퍼 클래스인 Integer를 넣어줌
		 * 인터페이스인 List는 List 인터페이스를 구현한 ArrayList 클래스의 객체를 
		 * 저장할 수 있다.
		 * 추상메소드와 상수로만 이루어진 것을 인터페이스라 한다.
		 * 추상메소드란 메소드의 선언부만 있고, 구현부가 없는 메소드
		 * 생성자에 추가한 5는 리스트의 size()가 아닌 용량을 의미한다.
		 * 리스트의 size() 메소드는 현재 저장된 객체의 갯수
		 * 리스트 안에는 배열로 되어 있는데, 이때 만들어진 배열의 크기가 용량이다.
		 */
		List<Integer> list = new ArrayList<Integer>(5);
		//List는 인터페이스이기 때문에 객체를 생성할 수 없다
		//List<Integer> list2 = new List<Integer>();
		int size = 5;
		Scanner scan = new Scanner(System.in);
		for(int i=0; i<size; i++) {
			/* 정수를 입력받아 tmp에 저장한 후 리스트의 add 메소드를 이용하여 추가하는데
			 * 이 때 정수 tmp를 Integer 클래스의 객체로 변환하여 저장한다.(오토박싱/언박싱)
			 * */
			int tmp = scan.nextInt();
			list.add(tmp);
		}

		int sum = 0;
		double avg = 0.0;
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			/* Iterator를 생성할 때 Iterator의 <>를 입력을 안하면 Object가 자동으로
			 * 들어가고, 그렇게 되면 it.next()를 통해 가져오는 정보의 클래스도 Object가
			 * 되기 때문에 형 변환이 필요 */
			Integer tmp = it.next();
			/* 래퍼 클래스를 이용할 때 주의할 사항
			 * int는 정수형을 저장하고, Integer 클래스는 정수형과 null을 저장한다.
			 * 따라서 Integer의 객체를 int로 저장하는 경우 Integer의 객체가 null인지
			 * 아닌지 판단할 필요가 있다. */
			if(tmp != null)
				sum += tmp;
		}
		avg = (double) sum / list.size();
		sum = sum(list);
		avg = avg(list);
		System.out.println(sum);
		System.out.println(avg);
		scan.close();
	}
	public static int sum(List<Integer> list) {
		int sum = 0;
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			Integer tmp = it.next();
			if(tmp != null)
				sum += tmp;
		}
		return sum;
	}
	public static double avg(List<Integer> list) {
		return (double)sum(list)/list.size();
	}
}
