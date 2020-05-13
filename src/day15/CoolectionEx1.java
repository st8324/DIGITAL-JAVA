package day15;

import java.util.*;

public class CoolectionEx1 {

	public static void main(String[] args) {
		/* Num 클래스의 객체만 저장 가능한 list를 ArrayList로 생성
		 * */
		ArrayList<Num> list = new ArrayList<Num>();
		list.add(new Num());
		//Ch클래스를 이용한 객체는 Num클래스를 이용한 객체가 아니므로 에러 발생
		//list.add(new Ch());
		//Num클래스를 상속받은 자식 클래스 Num2를 이용한 객체는 에러 발생하지 않음
		//자식 클래스를 부모 클래스로 자동 형변환할 수 있기 때문에
		//list.add(new Num2());
		list.add(new Num());
		list.add(new Num(1));
		list.add(new Num(100));
		printList(list);
		list.remove(new Num());
		System.out.println("num가 0인 객체를 지운 후 list");
		printList(list);
		ArrayList<Num> list2 = new ArrayList<Num>(list);
		System.out.println("복사 생성자를 이용한 list2");
		printList(list2);
		list.add(1,new Num(200));
		System.out.println("1번지에 200을 추가 후 list");
		printList(list);
		list2.clear();
		System.out.println("list2를 clear한 후 list2");
		printList(list2);
		list2.addAll(list);
		System.out.println("list를 list2에 추가 후 list2");
		printList(list2);
		System.out.println("향상된 for문을 이용하지 않은 반복문");
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		System.out.println("iterator를 이용한 출력문");
		Iterator<Num> it = list.iterator();
		while(it.hasNext()) {
			Num tmp = it.next();
			System.out.print( tmp + " ");
		}
		System.out.println();
		list.ensureCapacity(100);
		List<Num> list3 =  list.subList(0, 2);
		System.out.println("0번지에서 2번지 사이의 부분리스트(2번지 제외)");
		printList(list3);
		/* 익명클래스는 주로 메소드에서 인터페이스를 구현한 클래스가 필요한데 
		 * 해당 메소드가 기능이 하나뿐이서 따로 정의하기 귀찮은 경우 익명 클래스를 이용한다.
		 * */
		list.sort(new Comparator<Num>() {
			@Override
			public int compare(Num n0, Num n1) {
				if(n0.num > n1.num)
					return 1;
				if(n0.num < n1.num)
					return -1;
				return 0;
			}
		});
		System.out.println("정렬 후 list");
		printList(list);
	}

	private static void printList(List<Num> list) {
		for(Num tmp : list) {
			System.out.print(tmp+" ");
		}
		System.out.println();
	}

}
class Num{
	int num;

	@Override
	public String toString() {
		return "[num=" + num + "]";
	}
	public Num() {}
	public Num(int num) {this.num = num;}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + num;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Num other = (Num) obj;
		if (num != other.num)
			return false;
		return true;
	}
	
}
class Num2 extends Num{}
class Ch{
	char ch;

	@Override
	public String toString() {
		return "Ch [ch=" + ch + "]";
	}
	
}
